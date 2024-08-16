package com.example.androidexam.ui.homeScreen.homeScreenComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.androidexam.ui.theme.LightGrayColor

@Composable
fun SearchView(
    onValueChange : (String?) -> Unit
) {

    var value by remember { mutableStateOf<String?>(null) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    Row(modifier = Modifier
        .background(color = Color.White)
        .padding(vertical = 4.dp)
        .fillMaxWidth()) {

        OutlinedTextField(value = value ?: "",
            shape = RoundedCornerShape(size = 12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = LightGrayColor,
                unfocusedContainerColor = LightGrayColor,
                unfocusedBorderColor = LightGrayColor,
                focusedBorderColor = LightGrayColor,
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = null)
            },
            modifier = Modifier.fillMaxWidth(),
            keyboardActions = KeyboardActions(onDone = {
                focusManager.clearFocus()
                keyboardController?.hide()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            placeholder = { Text(text = "Search") },
            onValueChange = { value = it
                onValueChange(it)
            })
    }
}
