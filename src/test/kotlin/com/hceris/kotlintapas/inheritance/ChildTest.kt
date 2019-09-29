package com.hceris.kotlintapas.inheritance

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isA
import strikt.assertions.isEqualTo

internal class ChildTest {
    val instance = Child()

    @Test
    fun `child inherits from parent`() {
        expectThat(instance).isA<Parent>()
    }

    @Test
    fun `overrides say method`() {
        expectThat(instance.say()).isEqualTo("Hello world")
    }
}
