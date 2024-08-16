package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidexam.ui.theme.DotColor

@Composable
fun CustomPagerIndicator(
    pageCount : Int,
    currentPage : Int
) {

    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        repeat(times = pageCount) { currentPosition ->
            Box(modifier = Modifier
                .padding(horizontal = 2.dp)
                .clip(shape = CircleShape)
                .background(color = if (currentPosition == currentPage) DotColor else Color.Gray)
                .size(size = 8.dp))
        }
    }
}