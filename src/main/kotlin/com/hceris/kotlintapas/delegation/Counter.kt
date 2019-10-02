package com.hceris.kotlintapas.delegation

interface Counter {
    val current: Int
    fun next()
}

class CounterImpl(private var base: Int) : Counter {
    override val current
        get() = base

    override fun next() {
        base += 1
    }

}
