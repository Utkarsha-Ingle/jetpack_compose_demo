package com.example.jetpackcomposedemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    ShowViews()
            }
        }
    }


@Composable
fun ShowViews() {
    val scrollState = rememberScrollState()
    val context =  LocalContext.current
    Column (
        modifier = Modifier
            .background(Color(0xFFEDEAE0))
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {

        ButtonComponent(
            context = context,
            intent = Intent(context, TextActivity::class.java),
            buttonText = "Text View"
        )
        Divider(color = Color.Black)

        ButtonComponent(
            context = context,
            intent = Intent(context, EditTextActivity::class.java),
            buttonText = "Edit Text"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, ColumnActivity::class.java),
            buttonText = "Column"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, RowActivity::class.java),
            buttonText = "Row"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, ScrollableColumnActivity::class.java),
            buttonText = "Scrollable Column"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, ScrollableRowActivity::class.java),
            buttonText = "Scrollable Row"
        )

        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, BoxActivity::class.java),
            buttonText = "Box"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, CardActivity::class.java),
            buttonText = "Card"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, RadioButtonActivity::class.java),
            buttonText = "Radio Button"
        )
        Divider(color = Color.Black)
        ButtonComponent(
            context = context,
            intent = Intent(context, CheckboxActivity::class.java),
            buttonText = "Checkbox"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowPreview() {
   ShowViews()
}
@Composable
fun ButtonComponent(context: Context, intent: Intent, buttonText: String) {
    Button(
        onClick = {
            context.startActivity(intent)
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
    ) {
        Text(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            text = buttonText,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 16.sp


        )
    }
}