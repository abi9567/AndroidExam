package com.example.androidexam.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidexam.data.Fruit
import com.example.androidexam.databinding.FruitSingleItemBinding

class FruitAdapter (private val fruits : List<Fruit?>?) : RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    class ViewHolder(private val binding : FruitSingleItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Fruit?) {
            binding.tvFruitName.text = item?.name
            binding.tvFruitDescription.text = item?.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter.ViewHolder {
        val binding = FruitSingleItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: FruitAdapter.ViewHolder, position: Int) {
        val item = fruits?.get(index = position)
        holder.bind(item = item)
    }

    override fun getItemCount(): Int {
        return fruits?.size ?: 0
    }

}