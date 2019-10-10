package com.hceris.kotlintapas.higherorderfunctions

fun <T, U> Collection<T>.ourMap(transform: (T) -> U): Collection<U> {
    return arrayListOf<U>().also { newList ->
        for (item in this) {
            newList.add(transform(item))
        }
    }
}

fun Collection<Int>.multiplyByN(n: Int): () -> Collection<Int> {
    return { ourMap { it * n } }
}
