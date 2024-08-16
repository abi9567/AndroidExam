package com.example.androidexam.ui.homeScreen

import androidx.lifecycle.ViewModel
import com.example.androidexam.data.FruitCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModel : ViewModel() {

    val fruitCategory = FruitCategory.fruitList

    private val _selectedFruitCategory = MutableStateFlow<FruitCategory?>(value = fruitCategory.first())
    val selectedFruitCategory : Flow<FruitCategory?> = _selectedFruitCategory

    private val _searchKey = MutableStateFlow<String?>(value = null)
    val searchKey : Flow<String?> = _searchKey

    fun setFruitCategory(selectedIndex : Int) {
        _selectedFruitCategory.value = fruitCategory.get(index = selectedIndex)
        setSearchKey(input = null)
    }

    fun setSearchKey(input : String?) {
        _searchKey.value = input
        filterFruits(input = input)
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

}