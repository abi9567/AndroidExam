package com.example.androidexam.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidexam.ui.homeScreen.HomeScreen
import com.example.androidexam.ui.theme.AndroidExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidExamTheme {
                HomeScreen()
            }
        }
    }
}