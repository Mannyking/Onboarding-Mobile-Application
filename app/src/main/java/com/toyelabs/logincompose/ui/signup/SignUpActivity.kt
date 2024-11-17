package com.toyelabs.logincompose.ui.signup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.toyelabs.logincompose.theme.LoginComposeTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginComposeTheme {
                SignUpScreen {
                    
                }
            }
        }
    }
}