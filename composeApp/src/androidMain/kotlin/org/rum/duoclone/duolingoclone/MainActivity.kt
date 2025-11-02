package org.rum.duoclone.duolingoclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import org.rum.duoclone.duolingoclone.ui.screens.WelcomeScreen
import org.rum.duoclone.duolingoclone.ui.theme.DuolingoTheme
import org.rum.duoclone.duolingoclone.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            DuolingoTheme {
                var showWelcome by remember {mutableStateOf(true)}

                if (showWelcome){
                    WelcomeScreen(onFinished = {showWelcome = false})
                } else {
                    HomeScreen()
                }
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}