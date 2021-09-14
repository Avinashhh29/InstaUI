package com.example.myapplication.myapplication.instaui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.myapplication.instaui.ui.theme.HomeScreen
import com.example.myapplication.myapplication.instaui.ui.theme.InstaUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaUITheme {
                HomeScreen()

                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstaUITheme {
        HomeScreen()
    }
}