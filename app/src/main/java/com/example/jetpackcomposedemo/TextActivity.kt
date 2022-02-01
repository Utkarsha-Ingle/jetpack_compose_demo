package com.example.jetpackcomposedemo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            //column used to display vertical content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(scrollState)
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SimpleText(getString(R.string.welcome_jetpack_compose))
            }
        }
    }
}

// This is a Composable function. To write any Composable function, you need to use @Composable annotation
@Composable
fun SimpleText(displayText: String) {
    // Text composable is used to display some text
    Text(text = displayText,
        textAlign = TextAlign.Center,
        color = Color.Red,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize =  20.sp),
        textDecoration = TextDecoration.Underline
        )
}

// Android Studio provides an awesome feature of previewing your Compose UI elements while writing the code.
// To do so, you need to use @Preview annotation and then write a Composable function and call your UI element.
// The UI will be refreshed on every build or you can refresh manually from the UI preview tab.
@Preview
@Composable
fun SimpleTextPreview() {
    SimpleText("Hi I am a simple text")
}