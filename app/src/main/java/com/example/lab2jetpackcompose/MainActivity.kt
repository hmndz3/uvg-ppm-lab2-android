package com.example.lab2jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2jetpackcompose.ui.theme.Lab2JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab2JetpackComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PantallaInicial()
                }
            }
        }
    }
}

@Composable
fun PantallaInicial() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Harry Mendez", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "¡Bienvenido a mi app de Jetpack Compose!")
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            Toast.makeText(context, "¡Hola desde Jetpack Compose!", Toast.LENGTH_SHORT).show()
        }) {
            Text("Presióname")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicialPreview() {
    Lab2JetpackComposeTheme {
        PantallaInicial()
    }
}
