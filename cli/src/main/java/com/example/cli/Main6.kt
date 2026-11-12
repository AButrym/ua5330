package com.example.cli

import kotlin.random.Random

const val SIZE = 4
const val BLANK = 16

fun countInversions(a: IntArray): Int {
    var count = 0
    for (i in a.indices) {
        if (a[i] == BLANK) continue
        for (j in i + 1 ..< a.size) {
            if (a[j] == BLANK) continue
            if (a[i] > a[j]) count++
        }
    }
    return count
}

fun isSolvable(a: IntArray): Boolean {
    val blankRow = a.indexOf(BLANK) / SIZE
    val blankRowFromBottom = SIZE - blankRow
    return (countInversions(a) + blankRowFromBottom) % 2 == 1
}

fun shuffleBoard(a: IntArray) {
    for (i in a.lastIndex downTo 1) {
        val j = Random.nextInt(i + 1)
        val t = a[i]; a[i] = a[j]; a[j] = t
    }
}

fun makeSolvableBoard(): IntArray {
    val a = IntArray(SIZE * SIZE) { it + 1 }
    do {
        shuffleBoard(a)
    } while (!isSolvable(a))
    return a
}

fun main() {
    val solved = IntArray(16) { it + 1 }
    println(isSolvable(solved))

    val swapped = solved.copyOf()
    swapped[13] = 15
    swapped[14] = 14
    println(isSolvable(swapped))

    var allOk = true
    repeat(1000) {
        if (!isSolvable(makeSolvableBoard())) allOk = false
    }
    println("1000 random fields are: $allOk")
    println(makeSolvableBoard().contentToString())
}