package com.example.myapplication.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Counter(
    modifier: Modifier = Modifier
) {
    var a by remember { mutableIntStateOf(2) }
    Column(
        modifier = modifier
            .border(2.dp, Color.Blue)
            .padding(4.dp)
            .border(2.dp, Color.Black)
            .padding(4.dp)
//            .then(modifier)
    ) {
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