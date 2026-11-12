package com.example.cli

fun main() {
    fun reformat(
        str: String,
        normalizeCase: Boolean = true,
        wordSeparator: Char = ' ',
    ) { /* ... */
    }

    reformat(
        normalizeCase = false,
        str = "String!"
    )

}