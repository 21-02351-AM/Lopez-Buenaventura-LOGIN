package com.example.lopez_buenaventura_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lopez_buenaventura_login.interfaces.LogInForm
import com.example.lopez_buenaventura_login.ui.theme.Lopez_Buenaventura_LOGINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lopez_Buenaventura_LOGINTheme {
                LogInForm()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lopez_Buenaventura_LOGINTheme {
        Greeting("User")
    }
}