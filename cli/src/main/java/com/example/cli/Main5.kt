package com.example.cli

fun main11() {
    for (i in 1..5) {
        print("$i ")
    }
    println()
    for (i in (1..< 5).reversed()) {
        print("$i ")
    }
    for (ch in 'a'..'c') {
        print(ch)
    }
    val inRange = "hare" in "alpha".."omega"
    println(inRange)
    val arr = intArrayOf(1, 2, 5, 7)
    for (el in arr) {
        var el = el
        println("el = ${el}")
        el += 12
        println("el = ${el}")
    }
}

fun main() {
    val arr = intArrayOf(4, 8, 15, 16)
    for (x in arr) print("$x ")
    println()

    for (i in arr.indices) arr[i] = arr[i] * 2
    for ((i, x) in arr.withIndex()) println("arr[$i] = $x")

    for (i in arr.lastIndex downTo 0) print("${arr[i]} ")
    println()

    val grid = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5), intArrayOf(6))
    for (r in grid.indices) {
        for (c in grid[r].indices) {
            print("${grid[r][c]} ")
        }
        println()
    }
    println(grid.contentDeepToString())

    repeat(3) {
        println("Hello! $it")
    }
}