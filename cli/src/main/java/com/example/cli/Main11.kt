package com.example.cli

import java.util.Locale

data class Point(val x: Int, val y: Int)

open class Animal(val name: String)

class Dog(name: String) : Animal(name)

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(1, 2)
    println(p1 == p2)
    println(p1 === p2)
    println("=%.1f=".format(Locale.ROOT, 3.14))
}