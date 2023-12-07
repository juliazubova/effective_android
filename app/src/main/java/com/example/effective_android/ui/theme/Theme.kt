package com.example.effective_android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val darkColorScheme = darkColorScheme(
    primary = DarkGrey,
    onPrimary = LightGrey,
    primaryContainer = TranslucentBlue,
    onPrimaryContainer = Blue,
    secondary = White,
    onSecondary = Grey,
    tertiary = Yellow,
    onTertiary = Black
)

private val lightColorScheme = lightColorScheme(
    primary = LightGrey,
    onPrimary = DarkGrey,
    primaryContainer = TranslucentBlue,
    onPrimaryContainer = Blue,
    secondary = Black,
    onSecondary = Grey,
    tertiary = Yellow,
    onTertiary = Black
)

@Composable
fun Effective_androidTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkColorScheme else lightColorScheme,
        typography = Typography,
        content = content
    )
}