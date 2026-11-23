package com.example.cli

fun main() {
    val names2 = listOf("Оля", "Максим", "Оля", "Олесь")

    println(names2.associateWith { it.length })
// {Оля=3, Максим=6} — ключ: елемент, значення: результат лямбди


    println(names2.associateBy { it.first() })
// {О=Оля, М=Максим} — ключ: результат лямбди, значення: елемент

    listOf(listOf(1), listOf(2, 3)).flatMap { it }
        .forEach { println(it) }

    val m = mapOf(1 to "one", 2 to "two")
    for ((n, w) in m) {
        println("$n -> $w")
    }
    listOf<Pair<Int, Int>>().toMap()

}