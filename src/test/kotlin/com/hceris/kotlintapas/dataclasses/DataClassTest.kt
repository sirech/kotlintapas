package com.hceris.kotlintapas.dataclasses

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class DataClassTest {
    val one = DataClass("The number is ", 42)

    @Test
    fun `sensible equals`() {
        val two = DataClass("The number is ", 42)
        expectThat(one)
            .isEqualTo(two)
    }

    @Test
    fun `making a copy`() {
        val copy = one.copy()
        expectThat(one)
            .isEqualTo(copy)
    }
}
