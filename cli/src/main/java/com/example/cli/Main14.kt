package com.example.cli

fun main() {
    val stock = mutableMapOf(
        "milk" to 1,
        "bread" to 5,
        "bread2" to 5,
        "bread3" to 5,
        "eggs" to 12
    )
    for (item in stock) {
        println("${item.key} : ${item.value}")
    }
    for ((product, qty) in stock) {
        println("$product : $qty")
    }
    stock.forEach { item ->
        println("${item.key} : ${item.value}")
    }
    stock.forEach { (product, qty) ->
        println("$product : $qty")
    }
    println(stock.asIterable().first { (_, qty) -> qty == 5 })
}