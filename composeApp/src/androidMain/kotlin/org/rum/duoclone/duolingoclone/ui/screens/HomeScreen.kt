package org.rum.duoclone.duolingoclone.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.rum.duoclone.duolingoclone.R
import org.rum.duoclone.duolingoclone.ui.components.LessonsSection
import org.rum.duoclone.duolingoclone.ui.components.StageHeader

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF141F23))
    ) {
        // Espacio para status bar
        Spacer(modifier = Modifier.height(56.dp))

        // Top bar con íconos
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            StatusItem(R.drawable.flag, "3", Color.White)
            StatusItem(R.drawable.flame, "12", Color.White)
            StatusItem(R.drawable.gem, "245", Color(0xFF00B2FF))     // azul
            StatusItem(R.drawable.battery, "25", Color(0xFFFF6EC7)) // rosa
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Barra de etapa (StageHeader)
        StageHeader(
            moduleTitle = "Módulo 1 · Sección 1",
            sectionTitle = "Usa el presente",
            backgroundColor = Color(0xFF005BBB) // color de ejemplo
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Aquí vendrá el contenido scrollable
        // Por ahora lo dejamos vacío
        LessonsSection()
    }
}

@Composable
fun StatusItem(iconRes: Int, value: String, textColor: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = value,
            color = textColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
