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

class PaymentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCH8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting6("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String) {
    var total by remember { mutableStateOf("") }
    var bayar by remember { mutableStateOf("") }
    var sisa by remember { mutableStateOf("") }

    Column {
        TextField(value = total, onValueChange = {total = it},
            label = { Text("total") })
        TextField(value = bayar, onValueChange = {bayar = it},
            label = { Text("bayar") })
        Button(onClick = {
            sisa = (bayar.toInt()-total.toInt()).toString()
        }) {
            Text(text = "Bayar")
        }
        Text(text = sisa)

        val mcontext = LocalContext.current
        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, LoginActivity::class.java))
        }) {
            Text(text = "tugas 1")
        }

        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, HitungActivity::class.java))

        }) {
            Text(text = "tugas 2")
        }



    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    JetpackComposeCH8Theme {
        Greeting6("Android")
    }
}