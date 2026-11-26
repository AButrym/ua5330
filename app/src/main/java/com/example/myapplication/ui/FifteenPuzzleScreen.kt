package com.example.myapplication.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.Board
import com.example.myapplication.engine.FifteenPuzzleEngineImpl
import com.example.myapplication.ui.component.Counter
import com.example.myapplication.ui.component.Grid

@Composable
fun FifteenPuzzleScreen(
    board: Board,
    modifier: Modifier = Modifier,
    callback: (Int) -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Grid(board, callback)
        Counter(modifier = Modifier.align(
            Alignment.BottomCenter)
            .offset(y = (-40).dp, x = 40.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun FifteenPuzzleScreenPreview() {
    // brute, to be refactored
    var state by remember { mutableStateOf(Board.shuffledBoard()) }
    val engine by remember { mutableStateOf(FifteenPuzzleEngineImpl()) }

    fun onTileClick(id: Int) {
        state = engine.update(state, id)
    }

    FifteenPuzzleScreen(state, callback = ::onTileClick)
}