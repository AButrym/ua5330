package com.example.cli

fun main() {
    val names = listOf("Olha", "Maxim")

    val ages = listOf(20, 22, 23)

    for ( (name, age) in names zip ages) {
        println("$name : $age")
    }
}