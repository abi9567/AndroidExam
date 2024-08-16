package com.example.androidexam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidexam.data.FruitCategory
import com.example.androidexam.databinding.BannerItemBinding
import com.example.androidexam.extension.setImage

class BannerAdapter (private val bannerList : List<FruitCategory?>?) : RecyclerView.Adapter<BannerAdapter.PageViewHolder>() {

    class PageViewHolder(private val binding : BannerItemBinding, val context : Context) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : FruitCategory?) {
            item?.imageUrl?.let {
                context.setImage(imageView = binding.ivBanner, url = item?.imageUrl)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerAdapter.PageViewHolder {
        val binding = BannerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PageViewHolder(binding, context = parent.context)
    }

    override fun onBindViewHolder(holder: BannerAdapter.PageViewHolder, position: Int) {
        val item = bannerList?.get(position)
        holder.bind(item = item)
    }

    override fun getItemCount(): Int {
        return bannerList?.size ?: 0
    }
}