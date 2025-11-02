package org.rum.duoclone.duolingoclone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform