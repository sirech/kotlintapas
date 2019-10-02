package com.hceris.kotlintapas.grouping

fun budgetGoogle(document: String) =
    document
        .split("\\s+".toRegex())
        .groupingBy { it.toLowerCase()  }
        .eachCount()

