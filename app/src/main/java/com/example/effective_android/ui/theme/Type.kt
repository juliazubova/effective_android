package com.example.effective_android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.effective_android.R

val Typography = Typography(

    headlineLarge = TextStyle(
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700),
        letterSpacing = 0.5.sp,
    ),
    headlineSmall = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        letterSpacing = 0.5.sp,
    ),
    titleLarge = TextStyle(
        fontSize = 48.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700)
    ),
    titleMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700),
        letterSpacing = 0.6.sp,
    ),
    titleSmall = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        letterSpacing = 0.5.sp,
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        fontSize = 12.sp,
        lineHeight = 19.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontSize = 10.sp,
        fontFamily = FontFamily(Font(R.font.montserrat)),
        fontWeight = FontWeight(500),
    )
)