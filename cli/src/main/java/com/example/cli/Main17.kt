package com.example.cli

data class Purchase(val item: String, val price: Int, val category: String)

val receipt = listOf(
    Purchase("хліб", 35, "food"),
    Purchase("молоко", 42, "food"),
    Purchase("зошит", 28, "канцелярія"),
    Purchase("ручка", 15, "канцелярія"),
    Purchase("молоко", 42, "food")
)

fun main() {
    println(receipt.sumOf { it.price })
    println(receipt.map { it.category }.toSet())
    println(receipt.groupBy { it.category })
    println(receipt.associate { it.item to it.price })
    println(receipt.maxByOrNull { it.price })
    println(receipt.asSequence().map { it.item }.distinct().count())
}