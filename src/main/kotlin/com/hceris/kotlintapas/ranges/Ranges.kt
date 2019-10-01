package com.hceris.kotlintapas.ranges

fun isBetweenOneAndTen(x: Int): Boolean {
    if (x < 1) return false
    if (x > 10) return false
    return true
}

fun enumerate(x: Int): List<Int> {
    val list = mutableListOf<Int>()

    fun complicatedEnumerate(i: Int) {
        list.add(i)
        if (i < x) {
            complicatedEnumerate(i + 1)
        }
    }

    complicatedEnumerate(0)
    return list.toList()
}
