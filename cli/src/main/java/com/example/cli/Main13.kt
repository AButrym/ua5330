package com.example.cli

fun main() {
    val set = setOf(1, 3, 4)
    println(set.javaClass)
    val set2 = hashSetOf(1, 3, 4)
    set2.add(5)
    println(set2.javaClass)
    val set3 = mutableSetOf(1, 3, 4)
    set3.add(5)
    println(set3.javaClass)
    val arr1 = arrayOf(1, 2, 5, 7)
    val arr2 = arrayOf(5, 7, 8, 9)
    val set4 = setOf(1, 2, 3, *arr1, *arr2, *set2.toTypedArray())
    println(set4)
    set4 union set3
}