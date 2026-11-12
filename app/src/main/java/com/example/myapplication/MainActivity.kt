package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Tile(n: Int) {
    val isBlank = n == 16
    val text = if (isBlank) "" else n.toString()
    val alpha = if (isBlank) 0f else 1f
    Button(
        onClick = {},
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .size(80.dp)
            .alpha(alpha),
        contentPadding = PaddingValues.Zero
    ) {
        Text(
            text = text,
            fontSize = 60.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
fun Grid(board: Array<IntArray>) {
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
    val COLS = 4
    val board = Array(4) { r ->
        IntArray(4) { c -> r * COLS + c + 1 }
    }
    Grid(board)
}


@Preview(showBackground = true)
@Composable
fun TilePreview12() {
    Tile(12)
}

@Preview(showBackground = true)
@Composable
fun TilePreview1() {
    Tile(1)
}

@Preview(showBackground = true)
@Composable
fun TilePreviewBlank() {
    Tile(16)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello ${name.uppercase()}!\nHello ${name.uppercase()}!\nHello ${name.uppercase()}!",
        color = Color.Blue,
        style = TextStyle(
            color = Color.Red,
            fontSize = 30.sp,
            lineHeight = 1.5.em,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Monospace
        ),
        modifier = modifier
    )
}

@Composable
fun Counter() {
    var a by remember { mutableStateOf(2) }
    Column {
        Text(text = "Counter: $a")
        Button(onClick = {
            a++
        }) {
            Text(text = "Increment")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Counter()
}
