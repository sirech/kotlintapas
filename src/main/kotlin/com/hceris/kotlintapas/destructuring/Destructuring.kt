package com.hceris.kotlintapas.destructuring

class Point(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun asString(p: Point): String {
    val (x, y) = p
    return "Point[$x, $y]"
}
