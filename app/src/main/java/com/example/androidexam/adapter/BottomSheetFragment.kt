package com.example.androidexam.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidexam.R
import com.example.androidexam.databinding.ActivityMainBinding
import com.example.androidexam.databinding.BottomSheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment(
    private val categoryName : String?,
    private val totalFruitsCount : Int?,
    private val characterCount : String?

) : BottomSheetDialogFragment() {

    private lateinit var binding : BottomSheetLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvCategoryName.text = categoryName
            tvTotalFruits.text = (totalFruitsCount ?: 0).toString()
            tvCharacterCount.text = characterCount
        }
    }
}