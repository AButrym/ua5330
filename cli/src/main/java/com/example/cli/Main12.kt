package com.example.cli

import kotlin.random.Random

fun main() {
    val names = listOf("Alice", "Bob", "John")
    println(names.last())
    println(names[names.lastIndex])
    println(names[names.size - 1])
    val ix = Random.nextInt(5)
    if (ix in names.indices) println(names[ix])
    for (name in names) println(name)
    names.forEach(::println)
    names.forEachIndexed { ix, name ->
        println("${ix + 1}: $name")
    }
}