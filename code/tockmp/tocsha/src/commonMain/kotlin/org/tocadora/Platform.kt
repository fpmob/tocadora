package org.tocadora

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform