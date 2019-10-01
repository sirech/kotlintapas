package com.hceris.kotlintapas.dataclasses

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class DataClassTest {
    @Test
    fun `sensible equals`() {
        val one = DataClass("The number is ", 42)
        val two = DataClass("The number is ", 42)
        expectThat(one)
            .isEqualTo(two)
    }
}
