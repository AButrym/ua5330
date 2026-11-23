package com.example.myapplication.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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