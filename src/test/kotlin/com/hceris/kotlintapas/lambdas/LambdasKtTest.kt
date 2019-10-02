package com.hceris.kotlintapas.lambdas

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class LambdasKtTest {
    @Test
    fun `is zero for an empty list`() {
        expectThat(sumOfSquaredEvenNumbers(listOf())).isEqualTo(0)
    }

    @Test
    fun `sums a list correctly`() {
        expectThat(sumOfSquaredEvenNumbers((1..10).toList())).isEqualTo(220)
    }

    @Disabled("will take a while to run")
    @Test
    fun `sums a huge list`() {
        // it's ok to stop iterating at 100 elements
        sumOfSquaredEvenNumbers((1..1000000000).toList())
    }
}
