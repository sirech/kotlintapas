package com.hceris.kotlintapas.grouping

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.hasEntry

internal class GroupingKtTest {
    @Test
    fun `gets words grouped by frequency`() {
        val s = "This is a sentence that is basically not a sentence"
        expectThat(budgetGoogle(s)).and {
            hasEntry("this", 1)
            hasEntry("a", 2)
            hasEntry("sentence", 2)
            hasEntry("not", 1)
        }
    }

    @Test
    fun `works for the whole internet`() {
        val s = """
        Lorem ipsum dolor sit amet  consectetur adipiscing elit  sed do eiusmod tempor incididunt ut labore 
        et dolore magna aliqua  Ut enim ad minim veniam  quis nostrud exercitation ullamco laboris 
        nisi ut aliquip ex ea commodo consequat  Duis aute irure dolor in reprehenderit in 
        voluptate velit esse cillum dolore eu fugiat nulla pariatur 
        Excepteur sint occaecat cupidatat non proident  sunt in culpa qui officia deserunt mollit anim 
        id est laborum
        """.trimIndent()

        expectThat(budgetGoogle(s)).and {
            hasEntry("in", 3)
            hasEntry("lorem", 1)
            hasEntry("nisi", 1)
        }
    }
}
