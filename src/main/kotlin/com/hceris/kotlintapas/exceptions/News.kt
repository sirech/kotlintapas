package com.hceris.kotlintapas.exceptions

class News {
    fun good() = "good"
    fun bad(): String {
        moodyOperation()
        return "bad"
    }

    private fun moodyOperation(): Nothing {
        throw IllegalStateException("not today")
    }
}
