package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EditTextActivity : ComponentActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                SimpleTextComponent("Simple Edit Text")
                SimpleEditTextComponent()
                Divider(color = Color.Black)

                SimpleTextComponent("Edit Text for Numbers")
                EditTextNumberComponent()
                Divider(color = Color.Black)

               SimpleTextComponent("Edit Text for Passwords")
                EditTextPasswordComponent()
                Divider(color = Color.Black)
            }
        }
    }
}

@Composable
fun SimpleTextComponent(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            color = Color.Black
        ),
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    )
}

@Composable
fun SimpleEditTextComponent() {
        var text by remember { mutableStateOf(TextFieldValue("Enter text here")) }
        TextField(
            value = text,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onValueChange = {
                text = it
            }
        )
    }


@Composable
fun EditTextNumberComponent() {

        var text by remember { mutableStateOf(TextFieldValue("0123")) }
        // Here, only numerical keyboard will be opened
        TextField(value = text,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onValueChange = {
                text = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )

}

@Composable
fun EditTextPasswordComponent() {

        var text by remember { mutableStateOf(TextFieldValue("123456")) }
        // This is an example of Text Field taking password as an input. It will
        // hide the password text and will show a dot.

        TextField(value = text,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onValueChange = {
                text = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),

        )
}

