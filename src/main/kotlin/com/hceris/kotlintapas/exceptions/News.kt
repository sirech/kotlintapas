package com.hceris.kotlintapas.exceptions

class News {
    fun good() = "good"
    fun bad() = try {
        moodyOperation()
    } catch (e: IllegalStateException) {
        "bad"
    }

    private fun moodyOperation(): Nothing {
        throw IllegalStateException("not today")
    }
}
