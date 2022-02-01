package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CheckboxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CheckboxComponent()
        }
    }


    @Composable
    fun CheckboxComponent(){
        Column(
            Modifier
                .padding(25.dp)
        ) {
            val checkedState = remember { mutableStateOf(false)}

            Row(
                Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it },
                )

                Text(
                    text = "Do you like coffee?",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 10.dp),
                )
            }

            var result = "unchecked"
            var textColor = Color.Red
            if (checkedState.value){
                result = "checked"
                textColor = Color.Blue
            }

            Text(
                text = "Checkbox is $result.",
                fontSize = 25.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(25.dp),
                textAlign = TextAlign.Center,
                color = textColor
            )
        }
    }

}