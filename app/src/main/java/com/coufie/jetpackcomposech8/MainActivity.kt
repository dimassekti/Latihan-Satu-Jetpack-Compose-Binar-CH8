package com.coufie.jetpackcomposech8

import android.content.Intent
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coufie.jetpackcomposech8.ui.theme.JetpackComposeCH8Theme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCH8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    Column() {
                        ButtonCustom(title = "btn4", color = Color.Red)
                        ButtonCustom(title = "btn5", color = Color.Blue)
                        ButtonCustom(title = "btn6", color = Color.Green)
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonCustom(title : String, color : Color){
    Button(
        onClick = {},
        modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(color)
    ){
        Text(text = title)
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .border(width = 2.dp, color = Color.Red)
            .padding(15.dp)
            .height(200.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Hello $name!",
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Teks Kedua",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(
            modifier = Modifier.padding(15.dp)
        )
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Gray)

            ) {
            Text(text = "Simpan")
        }

        Row( ) {

            val mcontext = LocalContext.current
                Button(onClick = {
                    mcontext.startActivity(Intent(mcontext, InputLayout::class.java))
                }) {

                }

            Button(onClick = {},
            ) {
                Text(text = "Button 2")
            }

            Button(onClick = {},
            ) {
                Text(text = "Button 3")
            }
            Column(
                
            ) {
                Text(text = "satusatu")
                Text(text = "duadua")
            }
        }

        var text by remember {
            mutableStateOf("")
        }
        TextField(value = "edittext", onValueChange = {text = it})

        var text2 by remember {
            mutableStateOf("")
        }
        TextField(value = "edittext", onValueChange = {text2 = it})

        OutlinedTextField(value = "input nama", onValueChange = {text2 = it})
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCH8Theme {
        Greeting("Android")
    }
}