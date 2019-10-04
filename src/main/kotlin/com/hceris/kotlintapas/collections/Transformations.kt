package com.hceris.kotlintapas.collections

fun doublesEachElement(numbers: List<Int>): List<Int> = numbers

fun except2s(numbers: List<Int>): List<Int?> =
    numbers.map { if (it == 2) null else it * 3 }

// TODO: refactor to use association
fun givesMeaning(numbers: List<Int>): Map<Int, String> =
    numbers
        .map { if (it == 42) it to "is the answer of everything" else it to "is NOT the answer of everything" }
        .toMap()

