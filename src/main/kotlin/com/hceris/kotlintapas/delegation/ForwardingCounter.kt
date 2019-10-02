package com.hceris.kotlintapas.delegation

class ForwardingCounter(private val counter: CounterImpl): Counter by counter
