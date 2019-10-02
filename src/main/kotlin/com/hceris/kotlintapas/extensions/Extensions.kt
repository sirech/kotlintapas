package com.hceris.kotlintapas.extensions

fun isAnagram(s: String, s2: String): Boolean {
    return s.toList().sorted() == s2.toList().sorted()
}

fun isTheAnswerToEverything(n: Int) = n == 42

fun isCool(list: List<String>) = "cool" in list

