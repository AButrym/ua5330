package com.example.myapplication.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.engine.Board
import com.example.myapplication.engine.finalBoard
import com.example.myapplication.ui.component.Grid

@Composable
fun FifteenPuzzleScreen(
    board: Board,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Grid(board)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun FifteenPuzzleScreenPreview() {
    FifteenPuzzleScreen(finalBoard)
}