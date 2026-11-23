package com.example.myapplication.ui.component

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.Board
import com.example.myapplication.engine.finalBoard

@Composable
fun Grid(board: Board) {
    Column(verticalArrangement = spacedBy(1.dp)) {
        for (row in board) {
            Row(horizontalArrangement = spacedBy(1.dp)) {
                for (n in row) {
                    Tile(n)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridPreview() {
    Grid(finalBoard)
}
