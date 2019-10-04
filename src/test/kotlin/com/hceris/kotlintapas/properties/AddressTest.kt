package com.hceris.kotlintapas.properties

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class AddressTest {
    val subject = Address("BIG STREET 3", "80_336 ")
    @Test
    fun `street is normalized to lowercase`() {
        expectThat(subject)
            .get { street }
            .isEqualTo("big street 3")
    }

    @Test
    fun `zip is sanitized`() {
        expectThat(subject)
            .get { zip }
            .isEqualTo("80336")
    }
}
