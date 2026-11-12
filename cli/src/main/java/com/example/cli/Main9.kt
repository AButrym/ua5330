package com.example.cli

class Matrix(val rows: Int, val cols: Int) {
    private var data = IntArray(rows * cols)

    operator fun get(r: Int, c: Int) = data[ix(r, c)]

    operator fun set(r: Int, c: Int, v: Int) {
        data[ix(r, c)] = v
    }

    private fun ix(r: Int, c: Int) = r * cols + c
}


fun main() {
    fun printBoardMatrix(m: Matrix) {
        for (r in 0 ..< m.rows) {
            print("|")
            for (c in 0..< m.cols) {
                val v = m[r, c]
                val text = if (v == BLANK) "" else v.toString()
                print(text.padStart(3) + " |")
            }
            println()
        }
    }

    val board = Matrix(4, 4)
    (0..<4).forEach { r ->
        (0..<4).forEach { c ->
            board[r, c] = r * 4 + c + 1
        }
    }
//    for (r in 0..<4) {
//        for (c in 0..<4) {
//            board[r, c] = r * 4 + c + 1
//        }
//    }
    printBoardMatrix(board)
}