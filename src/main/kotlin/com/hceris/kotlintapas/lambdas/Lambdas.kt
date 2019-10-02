package com.hceris.kotlintapas.lambdas

fun sumOfSquaredEvenNumbers(list: Iterable<Int>) = sumOfSquaredEvenNumbers(list.asSequence())

fun sumOfSquaredEvenNumbers(list: Sequence<Int>) = list
    .filter { it % 2 == 0 }
    .take(100)
    .map { it * it }
    .fold(0) { a, b -> a + b }
