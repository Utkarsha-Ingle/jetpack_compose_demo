package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleBoxComponent()
        }
    }
}

@Composable
fun SimpleBoxComponent() {
    // A Box is a layout composable that is used to place children relative to its edges.
    // Initially, Stack was used in place of Box. But now, Stack is deprecated and Box is introduced.
    // As the name suggests, the children are placed inside parent.
    Box(modifier = Modifier.padding(30.dp,20.dp)) {
        Image(painter = painterResource(id = R.drawable.sample_img), contentDescription = "")

    }

}