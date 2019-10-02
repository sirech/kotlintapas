package com.hceris.kotlintapas.delegation

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class ForwardingCounterTest {
    val subject = ForwardingCounter(CounterImpl(0))

    @Test
    fun `counts`() {
        expectThat(subject.current).isEqualTo(0)

        subject.next()

        expectThat(subject.current).isEqualTo(1)
    }
}
