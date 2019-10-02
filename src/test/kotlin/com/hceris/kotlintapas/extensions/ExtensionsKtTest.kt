package com.hceris.kotlintapas.extensions

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

internal class ExtensionsKtTest {

    @Test
    fun `isAnagram checks anagrams`() {
        expectThat("listen".isAnagram("silent")).isTrue()
        expectThat("listen".isAnagram("buddy")).isFalse()
    }

    @Test
    fun `checks for the answer for everything`() {
        expectThat(42.isTheAnswerToEverything()).isTrue()
    }

    @Test
    fun `checks for coolness`() {
        expectThat(listOf("uncool", "coolio", "coolest").isCool()).isFalse()
    }
}
