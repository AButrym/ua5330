package com.example.myapplication.engine

import kotlin.math.abs

typealias Board = BoardImpl
typealias BoardData = List<Int>

const val DIM = 4
const val EMPTY = DIM * DIM

interface FifteenPuzzleEngine {
    fun generateStartPosition() = Board.shuffledBoard()

    fun update(oldBoard: Board, clickedTileId: Int): Board

    fun isFinal(board: Board): Boolean = board.isFinal
}

class FifteenPuzzleEngineImpl : FifteenPuzzleEngine {
    override fun update(
        oldBoard: Board,
        clickedTileId: Int
    ): Board {
        val emptyPos = oldBoard.findPositionById(EMPTY)
        val tilePos = oldBoard.findPositionById(clickedTileId)
        return if (tilePos.isNeighbouringTo(emptyPos))
            oldBoard.withSwapped(tilePos, emptyPos)
        else oldBoard
    }
}

class BoardImpl private constructor(private val _data: BoardData) {

    data class Position(val row: Int, val col: Int) {
        fun isNeighbouringTo(other: Position): Boolean =
            row == other.row && abs(col - other.col) == 1 ||
                    col == other.col && abs(row - other.row) == 1

        val ix: Int
            get() = row * DIM + col

        constructor(ix: Int) : this(row = ix / DIM, col = ix % DIM)

        companion object {
            fun ofIx(ix: Int) = Position(ix)
        }
    }

    operator fun iterator() = _data.chunked(DIM).iterator()

    operator fun get(row: Int, col: Int): Int =
        _data[row * DIM + col]

    fun findPositionById(tileId: Int): Position {
        val ix = _data.indexOf(tileId)
        return Position.ofIx(ix)
    }

    fun withSwapped(pos1: Position, pos2: Position): BoardImpl {
        val data = buildList {
            addAll(_data)
            this[pos1.ix] = this[pos2.ix].also {
                this[pos2.ix] = this[pos1.ix]
            }
        }
        return BoardImpl(data)
    }

    val isFinal: Boolean
        get() = this._data == finalBoard._data

    companion object {
        val finalBoard = BoardImpl((1..DIM * DIM).toList())

        fun shuffledBoard(): BoardImpl {
            var permutation: BoardData
            do {
                permutation = (1..DIM * DIM).shuffled()
            } while (!isSolvable((permutation)))
            return BoardImpl(permutation)
        }

        private fun isSolvable(permutation: List<Int>): Boolean {
            // TODO: implement the algorithm that calculate parity of inversions
            return true
        }
    }
}