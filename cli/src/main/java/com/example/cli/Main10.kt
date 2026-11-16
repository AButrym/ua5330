package com.example.cli

class Volume {
    var level: Int = 50
        set(value) {
            field = value.coerceIn(0, 100)
        }
    var levelStr: String = "N/A"
        get() = field.lowercase()
}

fun main() {
    val v1 = Volume()
    println(v1.level)
    v1.level = 120
    println(v1.level)
    v1.level = -10
    println(v1.level)
    v1.level = 20
    println(v1.level)
    println(v1.levelStr)
}