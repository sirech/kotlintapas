package com.hceris.kotlintapas.nullsafety

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.hasEntry

internal class NullSafeKtTest {
    @Test
    fun `hides password`() {
        expectThat(mapOf("user" to "dude", "password" to "guest123").hidePassword()).and {
            hasEntry("user", "dude")
            hasEntry("password", "********")
        }
    }

    @Test
    fun `works if the map does not have a password`() {
        expectThat(mapOf("user" to "dude").hidePassword()).and {
            hasEntry("user", "dude")
        }
    }
}
