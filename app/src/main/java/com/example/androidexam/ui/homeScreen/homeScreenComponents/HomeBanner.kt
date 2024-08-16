package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.androidexam.R

@Composable
fun HomeBannerView(imageUrl : String?) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(data = imageUrl)
            .placeholder(drawableResId = R.drawable.fruit_place_holder)
            .error(drawableResId = R.drawable.fruit_place_holder)
            .crossfade(enable = true)
            .build(),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .aspectRatio(ratio = 2F)
            .fillMaxWidth()
    )
}