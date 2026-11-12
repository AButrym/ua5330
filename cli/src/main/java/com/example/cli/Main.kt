package com.example.cli

import java.time.Year

object Properties {
    const val DAYS_IN_WEEK = 7.toLong()
}

fun main() {
    val name1: String = "Oles"
    print("Input your name: ")
    var name2 = readln()
    print("Input your age: ")
    val age: Int? = readln().toIntOrNull() // CFG DAF
    if (age == null) {
        println("You entered not a number!")
    } // smart cast
    println("Hello $name2!")
    println("Your age is ${(age ?: 0) + 12}!")
    println("DAYS_IN_WEEK = ${Properties.DAYS_IN_WEEK}")
}