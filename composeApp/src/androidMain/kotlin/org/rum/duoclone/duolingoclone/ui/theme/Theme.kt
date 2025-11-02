package org.rum.duoclone.duolingoclone.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val DuolingoColorScheme = darkColorScheme(
    primary = Color(0xFF57CC02), // verde Duolingo
    background = Color(0xFF141F23), // fondo oscuro
    onPrimary = Color.White,
    onBackground = Color.White
)

@Composable
fun DuolingoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DuolingoColorScheme,
        typography = MaterialTheme.typography,
        content = content
    )
}

val DuolingoTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 16.sp
    )
)



