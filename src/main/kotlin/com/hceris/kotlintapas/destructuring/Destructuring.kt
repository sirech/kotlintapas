package com.hceris.kotlintapas.destructuring

class Point(val x: Int, val y: Int)

fun asString(p: Point): String {
    val x = p.x
    val y = p.y
    return "Point[$x, $y]"
}
