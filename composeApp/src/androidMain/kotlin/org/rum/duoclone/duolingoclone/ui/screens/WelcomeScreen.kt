package org.rum.duoclone.duolingoclone.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import org.rum.duoclone.duolingoclone.R


@Composable
fun WelcomeScreen(onFinished: () -> Unit) {
    var phase by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        delay(700)
        phase = 1
        delay(800)
        onFinished()
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF57CC02)),
        contentAlignment = Alignment.Center
    ) {
        when (phase) {
            0 -> DuoFace()
            1 -> DuolingoText()
        }
    }
}

@Composable
fun DuoFace(){
    Image(
        painter = painterResource(id = R.drawable.duo_face),
        contentDescription = "Duo Face",
        modifier = Modifier.size(240.dp)
    )
}

@Composable
fun DuolingoText(){
    Text(
        text = "Duolingo",
        fontSize = 42.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )
}