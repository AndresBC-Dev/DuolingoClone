package org.rum.duoclone.duolingoclone.ui.model

import androidx.compose.ui.graphics.Color

data class Modulo(
    val id: Int,
    val titulo: String,
    val color: Color,
    val lecciones: List<Leccion>
)
data class Leccion(
    val id: Int,
    val titulo: String
)
