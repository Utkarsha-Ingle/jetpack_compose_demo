package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class RadioButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                displayRadioGroup()
            }
        }
    }
}

@Composable
fun displayRadioGroup(){
    var selected by remember { mutableStateOf("Male") }
    Row {
        RadioButton(selected = selected == "Male", onClick = { selected = "Male" })
        Text(
            text = "Male",
            modifier = Modifier
                .clickable(onClick = { selected = "Male" })
                .padding(start = 4.dp,top = 12.dp)

        )

        RadioButton(selected = selected == "Female", onClick = { selected = "Female" })
        Text(
            text = "Female",
            modifier = Modifier
                .clickable(onClick = { selected = "Female" })
                .padding(start = 4.dp,top = 12.dp)
        )
    }
}