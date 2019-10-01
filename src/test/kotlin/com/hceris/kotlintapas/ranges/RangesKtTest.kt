package com.hceris.kotlintapas.ranges

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import strikt.assertions.isFalse
import strikt.assertions.isTrue

internal class RangesKtTest {
    @Test
    fun `in range`() {
        expectThat(isBetweenOneAndTen(5)).isTrue()
        expectThat(isBetweenOneAndTen(-1)).isFalse()
        expectThat(isBetweenOneAndTen(50)).isFalse()
    }

    @Test
    fun `enumerates range`() {
        expectThat(enumerate(5)).isEqualTo(listOf(0, 1, 2, 3, 4, 5))
    }
}
