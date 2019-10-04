package com.hceris.kotlintapas.properties

class Address(_street: String, _zip: String) {
    val street: String by lazy { _street.toLowerCase() }
    val zip: String by lazy { _zip.trim().replace("_", "") }
}
