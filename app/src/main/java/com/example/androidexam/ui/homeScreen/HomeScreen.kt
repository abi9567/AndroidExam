package com.example.androidexam.ui.homeScreen

import androidx.activity.compose.BackHandler
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidexam.ui.homeScreen.homeScreenComponents.BottomSheetView
import com.example.androidexam.ui.homeScreen.homeScreenComponents.HomeBannerSliderView
import com.example.androidexam.ui.homeScreen.homeScreenComponents.ListItemSingleView
import com.example.androidexam.ui.homeScreen.homeScreenComponents.SearchView
import com.example.androidexam.ui.theme.DotColor
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(modifier : Modifier = Modifier,
               viewModel : HomeViewModel) {

    val selectedFruitCategory by viewModel.selectedFruitCategory.collectAsState(initial = null)
    val searchKey by viewModel.searchKey.collectAsState(initial = null)
    val scope = rememberCoroutineScope()
    val bottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)

    BackHandler(enabled = bottomSheetState.isVisible) {
        scope.launch {
            bottomSheetState.hide()
        }
    }

    ModalBottomSheetLayout(
        sheetState = bottomSheetState,
        sheetShape = MaterialTheme.shapes.medium.copy(bottomStart = CornerSize(0.dp), bottomEnd = CornerSize(0.dp)),
        sheetContent = {
        BottomSheetView(fruitCategory = selectedFruitCategory)
    }) {

        Box(modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxSize()) {

            LazyColumn(modifier = Modifier.animateContentSize(),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp),
                contentPadding = PaddingValues(vertical = 16.dp)
            ) {
                item {
                    HomeBannerSliderView(fruitCategoryList = viewModel.fruitCategory,
                        onFruitCategoryChanged = viewModel::setFruitCategory)
                }

                stickyHeader {
                    SearchView(searchKey = searchKey,
                        onValueChange = viewModel::setSearchKey)
                }

                items(items = selectedFruitCategory?.fruitList ?: emptyList()) { fruit ->
                    ListItemSingleView(fruit = fruit)
                }
            }

            IconButton(modifier = Modifier
                .padding(all = 16.dp)
                .clip(shape = CircleShape)
                .align(alignment = Alignment.BottomEnd)
                .background(color = DotColor),
                onClick = {
                scope.launch { bottomSheetState.show() }
            }) {
                Icon(imageVector = Icons.Default.MoreVert,
                    tint = Color.White,
                    contentDescription = null)
            }
        }
    }
}