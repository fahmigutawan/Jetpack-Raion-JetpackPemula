package com.example.composepemula.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ModifierDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "SOME TEXT", modifier = Modifier)

        Button(
            modifier = Modifier,
            onClick = { /*TODO*/ }
        ) {
            Text(text = "SOME BUTTON")
        }

        Column {
            //APAPUN
        }
    }
}

@Preview
@Composable
fun PrevModifierDemo(modifier: Modifier = Modifier) {
    ModifierDemo(
        modifier = Modifier.background(Color.White)
    )
}