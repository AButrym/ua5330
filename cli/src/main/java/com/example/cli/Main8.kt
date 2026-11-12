package com.example.cli


fun main() {
    val COLS = 4
    val BLANK = 16

    fun printBoardRows(board: Array<IntArray>) {
        for (row in board) {
            for (v in row) {
                val text = if (v == BLANK) "" else v.toString()
                print(text.padStart(3))
            }
            println()
        }
    }

    val board = Array(4) { r -> IntArray(4) {
        c -> r * COLS + c + 1 }
    }

    printBoardRows(board)
}