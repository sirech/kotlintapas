package com.hceris.kotlintapas.extensions

fun String.isAnagram(s: String): Boolean {
    return s.toList().sorted() == this.toList().sorted()
}

fun Int.isTheAnswerToEverything() = this == 42

fun List<String>.isCool() = "cool" in this

