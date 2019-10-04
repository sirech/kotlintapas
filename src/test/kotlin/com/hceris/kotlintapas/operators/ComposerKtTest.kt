package com.hceris.kotlintapas.operators

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class ComposerKtTest {
    val plus5 = { a: Int -> a + 5 }
    val asString = { b: Int -> b.toString() }

    @Test
    fun `pipes functions`() {
        val piped = pipe(plus5, asString)
        expectThat(piped(3)).isEqualTo("8")
    }
}
