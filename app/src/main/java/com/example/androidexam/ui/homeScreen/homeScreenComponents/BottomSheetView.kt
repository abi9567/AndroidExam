package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androidexam.R
import com.example.androidexam.data.FruitCategory

@Composable
fun BottomSheetView(fruitCategory : FruitCategory?) {

    Column(modifier = Modifier
        .navigationBarsPadding()
        .padding(horizontal = 16.dp, vertical = 24.dp)
        .fillMaxWidth()) {

        TitleDescriptionView(title = R.string.category_name, description = fruitCategory?.name)
        Spacer(modifier = Modifier.height(height = 8.dp))
        TitleDescriptionView(title = R.string.total_fruits, description = "${ fruitCategory?.fruitList?.size }")
        Spacer(modifier = Modifier.height(height = 8.dp))
        TitleDescriptionView(title = R.string.top_3_character_count, description = "A : 35")
    }
}

@Composable
fun TitleDescriptionView(@StringRes title : Int, description : String?) {
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        Text(text = stringResource(id = title),
            modifier = Modifier
                .weight(weight = 1F)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.width(width = 4.dp))

        Text(text = description ?: "",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .weight(weight = 1F)
                .fillMaxWidth()
        )
    }
}