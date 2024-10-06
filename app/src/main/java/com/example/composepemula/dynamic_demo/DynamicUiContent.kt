package com.example.composepemula.dynamic_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DynamicUiContent(modifier: Modifier = Modifier) {
    val state = remember { mutableStateOf(true) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if(state.value){
            Text(text = "INI TEXT SAAT TRUE")
        } else {
            Box(modifier = Modifier
                .size(280.dp)
                .background(Color.Blue))
        }

        Button(
            onClick = {
                state.value = !state.value
            }
        ) {
            Text(text = "Switch State")
        }
    }
}