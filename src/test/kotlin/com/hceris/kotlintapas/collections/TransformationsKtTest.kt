package com.hceris.kotlintapas.collections

import org.junit.jupiter.api.Test
import strikt.api.Assertion
import strikt.api.expectThat
import strikt.assertions.doesNotContain
import strikt.assertions.isEqualTo

internal class TransformationsKtTest {
    @Test
    internal fun `doubles each element returns a list containing the double of the initial values`() {
        expectThat(doublesEachElement(listOf(1, 2, 3))).isEqualTo(listOf(2, 4, 6))
    }

    @Test
    internal fun `except2s function call will not contain any nulls`() {
        expectThat(except2s(listOf(1,2,3))).doesNotContain(listOf(null))
    }

    fun Assertion.Builder<Map<Int, String>>.mapContainsSameElementsAs(expected: Map<Int, String>) =
        assert("map contains the same elements") {
            val comparatorByKey = compareBy<Int> { key -> key }
            expected.toSortedMap(comparatorByKey) == it.toSortedMap(comparatorByKey)
        }

    @Test
    internal fun `givesMeaning marks 42 as the answer of everything and anything else as not`() {
        val expected = mapOf(42 to "is the meaning of everything", 13 to "is NOT the meaning of everything")
        expectThat(givesMeaning(listOf(13, 42))).mapContainsSameElementsAs(expected)
    }
}