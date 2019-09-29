package com.hceris.kotlintapas.scopes

fun reverseWords(s: String) = s.split(" ").let { words ->
    words.map { w -> w.reversed() }.let { reversed ->
        reversed
            .joinToString(separator = " ")
            .reversed()
    }
}

