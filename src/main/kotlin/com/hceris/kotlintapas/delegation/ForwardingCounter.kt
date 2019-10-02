package com.hceris.kotlintapas.delegation

class ForwardingCounter(private val start: Int) : Counter {
    private val counter = CounterImpl(start)

    override val current: Int
        get() = counter.current

    override fun next() {
        counter.next()
    }
}
