package com.hceris.kotlintapas.scopes

fun reverseWords(s: String): String {
    val words = s.split(" ")
    val reversed = words.map { w -> w.reversed() }
    return reversed.joinToString(separator = " ").reversed()
}

