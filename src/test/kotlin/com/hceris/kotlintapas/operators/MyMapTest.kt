package com.hceris.kotlintapas.operators

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import strikt.assertions.isNotNull
import strikt.assertions.isNull
import strikt.assertions.isTrue

internal class MyMapTest {
    val myMap = MyMap(mapOf("the" to "stuff"))

    @Test
    fun `allows indexed access`() {
        expectThat(myMap["the"])
            .isNotNull()
            .isEqualTo("stuff")
    }

    @Test
    fun `works as usual for non existing values`() {
        expectThat(myMap["THE"])
            .isNull()
    }

    @Test
    fun `supports in operator`() {
        expectThat("the" in myMap).isTrue()
    }
}
