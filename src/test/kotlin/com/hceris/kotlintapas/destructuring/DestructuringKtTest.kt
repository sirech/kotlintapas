package com.hceris.kotlintapas.destructuring

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class DestructuringKtTest {
    @Test
    fun `converts a point to a string`() {
        expectThat(asString(Point(1, 2)))
            .isEqualTo("Point[1, 2]")
    }
}
