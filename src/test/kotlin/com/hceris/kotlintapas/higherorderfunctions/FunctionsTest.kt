package com.hceris.kotlintapas.higherorderfunctions

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.containsExactly

internal class FunctionsTest {
    @Test
    fun `maps transforms the elements in a list`() {
        expectThat((1..5).toList().ourMap {
            it * 2
        }).containsExactly(2, 4, 6, 8, 10)
    }

    @Test
    fun `creates a multiplier function`() {
        val by2 = (1..5).toList().multiplyByN(2)
        expectThat(by2()).containsExactly(2, 4, 6, 8, 10)
    }
}
