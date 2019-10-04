package com.hceris.kotlintapas.operators

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class MyIntTest {
    val subject = MyInt(5)

    @Test
    fun `supports addition`() {
        expectThat(subject + MyInt(3)).isEqualTo(MyInt(8))
    }

    @Test
    fun `supports addition with integers`() {
        expectThat(subject + 3).isEqualTo(MyInt(8))
    }

    @Test
    fun `supports ranges`() {
        expectThat((subject..7).toList()).isEqualTo(listOf(5, 6, 7))
    }
}
