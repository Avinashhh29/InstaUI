package com.example.myapplication.myapplication.instaui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.myapplication.instaui.R

// Set of Material typography styles to start with
val lobster= FontFamily(Font(R.font.lobster_regular, FontWeight.Normal))
val roboto = FontFamily(Font(R.font.roboto_light, FontWeight.Normal))
val instaName= FontFamily(Font(R.font.roboto_bold, FontWeight.Bold))
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)