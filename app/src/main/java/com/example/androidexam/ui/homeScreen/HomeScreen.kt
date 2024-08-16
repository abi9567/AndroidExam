package com.example.androidexam.ui.homeScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidexam.ui.homeScreen.homeScreenComponents.HomeBannerSliderView
import com.example.androidexam.ui.homeScreen.homeScreenComponents.ListItemSingleView
import com.example.androidexam.ui.homeScreen.homeScreenComponents.SearchView

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier : Modifier = Modifier,
               viewModel : HomeViewModel) {

    val selectedFruitCategory by viewModel.selectedFruitCategory.collectAsState(initial = null)

    Box(modifier = modifier
        .padding(horizontal = 16.dp)
        .fillMaxSize()) {

        LazyColumn(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item { HomeBannerSliderView(
                totalPageCount = viewModel.totalPageCount,
                onFruitCategoryChanged = viewModel::setFruitCategory
            ) }

            stickyHeader { SearchView(onValueChange = viewModel::filterFruits) }

            items(items = selectedFruitCategory?.fruitList ?: emptyList()) { fruit ->
                ListItemSingleView(fruit = fruit)
            }
        }
    }
}