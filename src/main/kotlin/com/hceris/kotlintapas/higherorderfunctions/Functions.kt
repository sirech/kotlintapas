package com.hceris.kotlintapas.higherorderfunctions

fun <T, U> Collection<T>.ourMap(transform: (T) -> U) = this
