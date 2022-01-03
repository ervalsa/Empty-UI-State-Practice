package com.ervalsa.emptyuistatepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ervalsa.emptyuistatepractice.ui.EmptyScreen
import com.ervalsa.emptyuistatepractice.ui.theme.EmptyUIStatePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmptyUIStatePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    EmptyScreen()
                }
            }
        }
    }
}