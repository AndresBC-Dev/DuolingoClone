package org.rum.duoclone.duolingoclone.ui.components

import android.view.MotionEvent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.rum.duoclone.duolingoclone.R

@Composable
fun LessonCoin(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.star,
    onClick: () -> Unit
) {
    var pressed by remember { mutableStateOf(false) }

    val coinSize = 76.dp

    val offsetY by animateDpAsState(
        targetValue = if (pressed) 4.dp else (-4).dp,
        animationSpec = tween(
            durationMillis = 100,
            easing = androidx.compose.animation.core.FastOutLinearInEasing
        )
    )

    Box(
        modifier = modifier
            .size(coinSize)
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        pressed = true
                        true
                    }
                    MotionEvent.ACTION_UP -> {
                        pressed = false
                        onClick()
                        true
                    }
                    MotionEvent.ACTION_CANCEL -> {
                        pressed = false
                        true
                    }
                    else -> false
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.lesson_coin_shadow),
            contentDescription = null,
            modifier = Modifier
                .offset(y = 4.dp)
                .size(coinSize)
        )

        Image(
            painter = painterResource(id = R.drawable.lesson_coin),
            contentDescription = "Lesson Coin",
            modifier = Modifier
                .offset(y = offsetY)
                .size(coinSize)
        )

        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "Lesson Icon",
            modifier = Modifier
                .size(coinSize * 0.90f)
                .align(Alignment.Center)
                .offset(y = offsetY - 4.dp)
        )
    }
}
