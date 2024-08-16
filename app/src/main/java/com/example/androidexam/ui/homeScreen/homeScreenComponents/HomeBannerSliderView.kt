package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.androidexam.data.FruitCategory

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeBannerSliderView(
    fruitCategoryList : List<FruitCategory?>?,
    onFruitCategoryChanged : (Int) -> Unit
) {

    val pagerState = rememberPagerState { fruitCategoryList?.size ?: 0 }

    LaunchedEffect(key1 = pagerState.currentPage) {
        onFruitCategoryChanged(pagerState.currentPage)
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        HorizontalPager(state = pagerState,
            key = { it },
            modifier = Modifier
                .clip(shape = RoundedCornerShape(size = 16.dp))
                .fillMaxWidth()) { position ->
            HomeBannerView(imageUrl = fruitCategoryList?.get(index = position)?.imageUrl)
        }

        Spacer(modifier = Modifier.height(height = 16.dp))

        CustomPagerIndicator(pageCount = pagerState.pageCount,
            currentPage = pagerState.currentPage)
    }
}