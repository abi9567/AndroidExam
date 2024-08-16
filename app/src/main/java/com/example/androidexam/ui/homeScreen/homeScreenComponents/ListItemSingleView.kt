package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.androidexam.R
import com.example.androidexam.data.Fruit
import com.example.androidexam.ui.theme.ItemColor

@Composable
fun ListItemSingleView(fruit : Fruit?) {

    Row(modifier = Modifier
        .clip(shape = RoundedCornerShape(size = 12.dp))
        .background(color = ItemColor)
        .padding(all = 8.dp)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(fruit?.image)
                .placeholder(drawableResId = R.drawable.fruit_place_holder)
                .error(drawableResId = R.drawable.fruit_place_holder)
                .crossfade(enable = true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(size = 8.dp))
                .size(size = 35.dp)
        )

        Spacer(modifier = Modifier.width(width = 16.dp))

        Column(verticalArrangement = Arrangement.Center) {
            Text(text = fruit?.name ?: "",
                style = MaterialTheme.typography.titleMedium)

            Text(text = fruit?.description ?: "",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.bodySmall)
        }
    }
}