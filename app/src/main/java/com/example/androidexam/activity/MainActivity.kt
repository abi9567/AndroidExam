package com.example.androidexam.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidexam.ui.homeScreen.HomeScreen
import com.example.androidexam.ui.homeScreen.HomeViewModel
import com.example.androidexam.ui.theme.AndroidExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel : HomeViewModel = viewModel()
            AndroidExamTheme {
                Scaffold(containerColor = Color.White) { paddingValues ->
                    HomeScreen(modifier = Modifier.padding(paddingValues = paddingValues),
                        viewModel = viewModel)
                }
            }
        }
    }
}