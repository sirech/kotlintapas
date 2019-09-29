package com.hceris.kotlintapas.inheritance

class Child(message: String): Parent(message) {
    override fun say() = "Hello ${super.say()}"
}
