package com.example.androidexam.extension

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.androidexam.R

fun Context.setImage(imageView : ImageView, url : String?) {
    Glide.with(this)
        .load(url)
        .placeholder(R.drawable.fruit_place_holder)
        .error(R.drawable.fruit_place_holder)
        .into(imageView)
}