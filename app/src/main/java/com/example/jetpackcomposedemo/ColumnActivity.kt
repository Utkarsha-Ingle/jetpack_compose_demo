package com.example.jetpackcomposedemo

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class ColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleColumnComponent()
        }
    }
}

@Composable
fun SimpleColumnComponent() {
    // Column is used to keep the child vertically.
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Welcome to Jetpack Compose Column Demo", color = Color.Black)
        Text(text = "Welcome to Jetpack Compose Column Demo", color = Color.Blue)
        Text(text = "Welcome to Jetpack Compose Column Demo", color = Color.Red)
        Text(text = "Welcome to Jetpack Compose Column Demo", color = Color.Green)
    }
}
