package com.example.counterscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import com.example.counterscreen.ui.theme.CounterScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterScreenTheme {
                Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
                    CounterScreen()
                }
            }
        }
    }
}