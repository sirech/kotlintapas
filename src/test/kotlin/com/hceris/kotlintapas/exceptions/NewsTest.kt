package com.hceris.kotlintapas.exceptions

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class NewsTest {
    val subject = News()

    @Test
    fun `good news`() {
        expectThat(subject.good()).isEqualTo("good")
    }

    @Test
    fun `bad news`() {
        expectThat(subject.bad()).isEqualTo("bad")
    }
}
