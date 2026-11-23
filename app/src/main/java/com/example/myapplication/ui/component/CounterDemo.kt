package com.example.myapplication.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Counter() {
    var a by remember { mutableIntStateOf(2) }
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