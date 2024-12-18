package com.toyelabs.logincompose.ui.getstarted

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.toyelabs.logincompose.theme.LoginComposeTheme
import com.toyelabs.logincompose.ui.signup.SignUpActivity

class GetStartedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginComposeTheme {
                GetStartedScreen {
                    startActivity(Intent(this, SignUpActivity::class.java))
                }
            }
        }
    }
}
