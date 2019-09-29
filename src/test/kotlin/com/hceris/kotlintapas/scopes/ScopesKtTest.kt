package com.hceris.kotlintapas.scopes

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class ScopesKtTest {
    @Test
    fun `reverses words`() {
        expectThat(reverseWords("this is a sentence")).isEqualTo("sentence a is this")
    }
}
