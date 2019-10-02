package com.hceris.kotlintapas.grouping

fun budgetGoogle(document: String): Map<String, Int> {
    val words = document.split("\\s+".toRegex()).map { it.toLowerCase() }
    val frequencies = mutableMapOf<String, Int>()

    for (word in words) {
        when (val count = frequencies[word]) {
            null -> frequencies[word] = 1
            else -> frequencies[word] = count + 1
        }
    }

    return frequencies.toMap()
}
