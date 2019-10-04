package com.hceris.kotlintapas.nullsafety

fun Map<String, String>.hidePassword(): Map<String, String> {
    return toMutableMap().also { copy ->
        // String? could be null, we are forced to declare what to do
        copy["password"]?.let { password ->
            copy["password"] = password.hidden()
        }
    }.toMap()
}

private fun String.hidden(): String {
    return "*".repeat(this.length)
}
