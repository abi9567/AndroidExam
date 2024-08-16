package com.example.androidexam.activity

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.androidexam.adapter.BannerAdapter
import com.example.androidexam.adapter.BottomSheetFragment
import com.example.androidexam.adapter.FruitAdapter
import com.example.androidexam.data.FruitCategory
import com.example.androidexam.databinding.ActivityMainBinding
import com.example.androidexam.ui.homeScreen.HomeViewModel
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel : HomeViewModel by viewModels()
    private lateinit var bottomSheet : BottomSheetFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            viewModel.selectedFruitCategory.collectLatest { selectedFruitCat ->
                updateUI(
                    selectedFruitCategory = selectedFruitCat,
                    context = this@MainActivity,
                    binding = binding
                )

                viewModel.characterCountString.collectLatest {
                    bottomSheet = BottomSheetFragment(
                        categoryName = selectedFruitCat?.name,
                        totalFruitsCount = selectedFruitCat?.fruitList?.size,
                        characterCount = it,
                    )
                }
            }
        }

        val adapter = BannerAdapter(bannerList = viewModel.fruitCategory)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayoutDoter, binding.viewPager) { tab, position -> }.attach()

        binding.editTextSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                return
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                viewModel.setSearchKey(input = p0?.toString())
            }
            override fun afterTextChanged(p0: Editable?) {
                return
            }
        })

        val callBack = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                viewModel.setFruitCategory(selectedIndex = position)
                binding.editTextSearch.text = null
            }
        }

        binding.viewPager.registerOnPageChangeCallback(callBack)

        binding.fabViewBottomSheet.setOnClickListener {
            viewModel.getTopThreeCharacterCount()
            bottomSheet.show(supportFragmentManager, bottomSheet.tag)
        }
    }
}

fun updateUI(selectedFruitCategory : FruitCategory?,
             binding: ActivityMainBinding,
             context : Context) {

    binding.rvFruits.layoutManager = LinearLayoutManager(context)
    binding.rvFruits.adapter = FruitAdapter(fruits = selectedFruitCategory?.fruitList)
}