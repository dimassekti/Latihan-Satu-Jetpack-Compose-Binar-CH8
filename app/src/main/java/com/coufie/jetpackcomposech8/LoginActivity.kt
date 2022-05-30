package com.coufie.jetpackcomposech8

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.coufie.jetpackcomposech8.ui.theme.JetpackComposeCH8Theme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCH8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var username1 by remember { mutableStateOf("") }
    var password1 by remember { mutableStateOf("") }

    Column {
        TextField(value = username, onValueChange = {username = it},
            label = { Text("username") })
        TextField(value = password, onValueChange = {password = it},
            label = { Text("password") })
        Button(onClick = {
            username1 = username.toString()
            password1 = password.toString()
        }) {
            Text(text = "Login")
        }
        Text(text = username1)
        Text(text = password1)

        val mcontext = LocalContext.current
        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, HitungActivity::class.java))
        }) {
            Text(text = "tugas 2")
        }

        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, PaymentActivity::class.java))

        }) {
            Text(text = "tugas 3")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    JetpackComposeCH8Theme {
        Greeting4("Android")
    }
}