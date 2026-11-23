package com.example.myapplication.engine

typealias Board = Array<IntArray>

const val COLS = 4

val finalBoard
    get() = Array(4) { r ->
        IntArray(4) { c -> r * COLS + c + 1 }
    }