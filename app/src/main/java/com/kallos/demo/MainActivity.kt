package com.kallos.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.kallos.components.KallosTextField
import com.kallos.demo.ui.theme.KallosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KallosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    var valuee by remember { mutableStateOf("") }

                    KallosTextField(
                        value = valuee,
                        onValueChange = {
                            valuee = it
                        },
                        label = {
                            Text("Ahhhh")
                        },
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}
