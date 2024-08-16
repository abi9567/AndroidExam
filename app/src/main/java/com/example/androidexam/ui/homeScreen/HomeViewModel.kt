package com.example.androidexam.ui.homeScreen

import android.util.Log
import androidx.compose.ui.text.toLowerCase
import androidx.lifecycle.ViewModel
import com.example.androidexam.data.FruitCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.Locale

class HomeViewModel : ViewModel() {

    val fruitCategory = FruitCategory.fruitList

    private val _selectedFruitCategory = MutableStateFlow<FruitCategory?>(value = fruitCategory.first())
    val selectedFruitCategory : Flow<FruitCategory?> = _selectedFruitCategory

    private val _searchKey = MutableStateFlow<String?>(value = null)
    val searchKey : Flow<String?> = _searchKey

    private val _characterCountString = MutableStateFlow<String?>(value = null)
    val characterCountString : Flow<String?> = _characterCountString

    fun setSearchKey(input : String?) {
        _searchKey.value = input
        filterFruits(input = input)
    }

    fun setFruitCategory(selectedIndex : Int) {
        _selectedFruitCategory.value = fruitCategory.get(index = selectedIndex)
        setSearchKey(input = null)
    }

    init {
        getTopThreeCharacterCount()
    }

    private fun filterFruits(input : String?) {

        if (input.isNullOrEmpty()) {
            resetFruits()
            return
        }

        if (_selectedFruitCategory.value?.fruitList.isNullOrEmpty()) {
            resetFruits()
        }

        val tempListCategory = _selectedFruitCategory.value
        val filteredFruitList = tempListCategory?.fruitList?.filter {
            it?.name?.contains(other = input, ignoreCase = true) ?: false
        }
        _selectedFruitCategory.value = tempListCategory?.copy(fruitList = filteredFruitList)
    }

    private fun resetFruits() {
        val currentIndex = _selectedFruitCategory.value?.index
        _selectedFruitCategory.value = fruitCategory.get(index = currentIndex ?: 0)
    }

    fun getTopThreeCharacterCount() {
        val currentSelectedFruitNameList = _selectedFruitCategory.value?.fruitList
            ?.map { it?.name?.uppercase(Locale.US) }

        val allFruitSingleString = currentSelectedFruitNameList?.joinToString(separator = "")
        val removedSpaceFromString = allFruitSingleString?.replace(oldValue = " ", newValue = "")
        val keyValueMap = removedSpaceFromString?.groupBy { it }?.entries?.sortedByDescending { it.value.size }
        var itemSizeString = ""

        for (i in 0 until 3) {
            val item = keyValueMap?.getOrNull(index = i)
            item?.let {
                itemSizeString +=
                    (if (i != 0) ", " else "") + ("${ item.key }" + "-" + "${ item.value.size }")
            }
        }

        _characterCountString.value = itemSizeString
    }
}