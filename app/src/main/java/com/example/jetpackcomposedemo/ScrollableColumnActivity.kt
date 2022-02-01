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

class ScrollableColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollItems()
        }
    }
}



@Composable
fun ScrollItems() {
    Column(
        modifier = Modifier.padding(20.dp,20.dp)
            .background(Color.LightGray)
            .size(500.dp)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(20) {
            Text("Item $it", modifier = Modifier.padding(8.dp))
        }
    }
}