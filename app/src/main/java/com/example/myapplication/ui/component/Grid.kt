package com.example.myapplication.ui.component

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.Board

@Composable
fun Grid(
    board: Board,
    callback: (Int) -> Unit = {}
) {
    Column(
        verticalArrangement = spacedBy(1.dp)
    ) {
        for (row in board) {
            Row(horizontalArrangement = spacedBy(1.dp)) {
                for (n in row) {
                    Tile(n, callback)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridPreview1() {
    Grid(Board.finalBoard)
}

@Preview(showBackground = true)
@Composable
fun GridPreview2() {
    Grid(Board.shuffledBoard())
}
