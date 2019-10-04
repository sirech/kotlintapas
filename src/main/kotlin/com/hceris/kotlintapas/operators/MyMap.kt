package com.hceris.kotlintapas.operators

class MyMap<K, V>(private val map: Map<K, V>) {
    operator fun get(key: K) = map[key]
    operator fun contains(key: K) = key in map
}
