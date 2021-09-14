package com.example.myapplication.myapplication.instaui

import androidx.compose.ui.graphics.painter.Painter

data class PostDetails(
    val name: String,
    val dp: Painter,
    val post: Painter,
    val caption:String,
    val likes : Int,
    val comments: Int,
    val timeStamp:Int
)