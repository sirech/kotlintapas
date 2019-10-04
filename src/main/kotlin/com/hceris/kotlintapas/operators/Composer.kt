package com.hceris.kotlintapas.operators

fun <A, B, C> pipe(f1: (A) -> B, f2: (B) -> C): (A) -> C {
    return { a -> f2(f1(a)) }
}
