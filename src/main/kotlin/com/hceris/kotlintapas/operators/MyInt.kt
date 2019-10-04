package com.hceris.kotlintapas.operators

data class MyInt(private val value: Int) {
    operator fun plus(other: Int) = MyInt(value + other)
    operator fun plus(other: MyInt) = MyInt(value + other.value)
    operator fun rangeTo(other: Int) = IntRange(value, other)
}
