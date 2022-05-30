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

class HitungActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCH8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String) {
    var panjang by remember { mutableStateOf("") }
    var lebar by remember { mutableStateOf("") }
    var tinggi by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column {
        TextField(value = panjang, onValueChange = {panjang = it},
            label = { Text("panjang") })
        TextField(value = lebar, onValueChange = {lebar = it},
            label = { Text("lebar") })
        TextField(value = tinggi, onValueChange = {tinggi = it},
            label = { Text("tinggi") })
        Button(onClick = {
            hasil = (panjang.toInt()*lebar.toInt()*tinggi.toInt()).toString()
        }) {
            Text(text = "Hitung")
        }
        Text(text = hasil)
        val mcontext = LocalContext.current
        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, LoginActivity::class.java))
        }) {
            Text(text = "tugas 1")
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
fun DefaultPreview5() {
    JetpackComposeCH8Theme {
        Greeting5("Android")
    }
}