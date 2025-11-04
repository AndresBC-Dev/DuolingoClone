package org.rum.duoclone.duolingoclone.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.rum.duoclone.duolingoclone.ui.model.Modulo
import org.rum.duoclone.duolingoclone.R
import kotlin.math.sin

@Composable
fun ModuloView(modulo: Modulo) {
    var leccionSeleccionada by remember { mutableStateOf<String?>(null) }

    Column(modifier = Modifier.fillMaxWidth()) {
        // Centrado horizontal de la columna de monedas
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Parámetros de la fórmula
                val A = -70f
                val n = modulo.lecciones.size
                val SinOmega = (3 * Math.PI) / (n - 1)
                val phi = -Math.PI

                modulo.lecciones.forEachIndexed { i, leccion ->
                    val arg = SinOmega * i + phi
                    val sinArg = sin(arg)
                    val scaled = A * sinArg

                    LessonCoin(
                        iconRes = R.drawable.star,
                        onClick = { leccionSeleccionada = leccion.titulo },
                        modifier = Modifier.offset(x = scaled.dp)
                    )
                }
            }
        }

        if (leccionSeleccionada != null) {
            AlertDialog(
                onDismissRequest = { leccionSeleccionada = null },
                confirmButton = {
                    Button(onClick = { leccionSeleccionada = null }) {
                        Text("Cerrar")
                    }
                },
                title = { Text("Lección") },
                text = { Text("Has abierto: ${leccionSeleccionada}") }
            )
        }
    }
}
