package com.example.cli

fun main() {
    var i = 12
    val a = (i++ > 12) and (i++ <= 12)
    println("i = $i")
    println("a = ${a}")
    val s = ""
    println(i in 2..7)
    println(s.isEmpty())
    println(s.isNotEmpty())
}