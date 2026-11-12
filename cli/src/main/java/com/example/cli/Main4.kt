package com.example.cli

fun main() {
    val a = 9
    when {
        a > 11  -> println("a == 11")
        a == 10 -> println("a = 10")
        else    -> {
            println("a <= 11")
            println("Too small!")
        }
    }
    val res = if (a > 10) "Great!" else "So so"
    val res2 = when (a > 10) {
        true  -> "Great!"
        false -> {
            println(">>So so")
        }
    }
    println(res)
    println(res2)
    println("End")
    val i: Int? = 10
    val j: Int? = null
    val b: Int? = (i ?: j)

    when {
        j == null -> println("NULL!!!")
        j < 10 -> println("Not in 0..10")
        j in 0..10 -> println("Not in 0..10")
        else -> println(j!! + 1)
    }
    val myNull = null

    val n: Int = myNothing()
    val s: String = myNothing()
    println("n = $n")
}

fun myNothing(): Nothing {
    while(true) {
        throw IllegalArgumentException()
    }
}