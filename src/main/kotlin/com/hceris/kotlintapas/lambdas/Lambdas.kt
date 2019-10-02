package com.hceris.kotlintapas.lambdas

fun sumOfSquaredEvenNumbers(list: Iterable<Int>): Int {
    var sum = 0
    for(number in list) {
        if(number % 2 == 0) {
            sum += number * number
        }
    }
    return sum
}
