package com.hceris.kotlintapas.sealedclasses

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import strikt.assertions.isFalse
import strikt.assertions.isTrue

internal class TheAnswerTest {

    @Test
    internal fun `42 is TheAnswer ToEverything`() {
        expectThat(whatIs(42)).isEqualTo(TheAnswer.ToEverything)
    }

    @Test
    internal fun `13 is TheAnswer ToSomethingElse`() {
        expectThat(whatIs(13)).isEqualTo(TheAnswer.ToSomethingElse)
    }

    @Test
    internal fun `isTheAnswerToEverything for 42 returns true`() {
        expectThat(isTheAnswerToEverything(42)).isTrue()
    }

    @Test
    internal fun `isTheAnswerToEverything for 13 returns false`() {
        expectThat(isTheAnswerToEverything(42)).isFalse()
    }
}
