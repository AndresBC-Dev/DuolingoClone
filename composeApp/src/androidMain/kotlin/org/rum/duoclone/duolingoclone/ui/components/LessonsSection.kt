package org.rum.duoclone.duolingoclone.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.rum.duoclone.duolingoclone.ui.model.Leccion
import org.rum.duoclone.duolingoclone.ui.model.Modulo


@Composable
fun LessonsSection() {
    val moduloEjemplo = Modulo(
        id = 1,
        titulo = "Módulo 1 · Usa el presente",
        color = Color(0xFF005BBB),
        lecciones = List(15) { i -> Leccion(i, "Lección ${i + 1}") }
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),

        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item {
            ModuloView(moduloEjemplo)
        }
    }
}
