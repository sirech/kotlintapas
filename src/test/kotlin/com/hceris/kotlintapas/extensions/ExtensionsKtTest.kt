package com.hceris.kotlintapas.extensions

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

internal class ExtensionsKtTest {

    @Test
    fun `isAnagram checks anagrams`() {
        expectThat(isAnagram("listen", "silent")).isTrue()
        expectThat(isAnagram("listen", "buddy")).isFalse()
    }

    @Test
    fun `checks for the answer for everything`() {
        expectThat(isTheAnswerToEverything(42)).isTrue()
    }

    @Test
    fun `checks for coolness`() {
        expectThat(isCool(listOf("uncool", "coolio", "coolest"))).isFalse()
    }
}
