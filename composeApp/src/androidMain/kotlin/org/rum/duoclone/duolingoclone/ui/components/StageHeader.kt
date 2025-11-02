package org.rum.duoclone.duolingoclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.rum.duoclone.duolingoclone.R

@Composable
fun StageHeader(
    moduleTitle: String,
    sectionTitle: String,
    backgroundColor: Color = Color(0xFF005BBB) // color de ejemplo
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        // Capa inferior: “sombra dibujada”
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .graphicsLayer {
                    translationY = 4f // desplaza hacia abajo
                    scaleX = 1.02f     // ligeramente más ancho
                    scaleY = 1.02f     // ligeramente más alto
                }
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF003366)) // sombra más oscura
        )

        // Capa superior: tarjeta real
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(backgroundColor)
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(0.85f)
                ) {
                    Text(
                        text = moduleTitle,
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = sectionTitle,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Box(
                    modifier = Modifier.weight(0.15f),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.notebook),
                        contentDescription = "Notebook icon",
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
        }
    }
}
