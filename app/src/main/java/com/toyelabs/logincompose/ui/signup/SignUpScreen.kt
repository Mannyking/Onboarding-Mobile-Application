package com.toyelabs.logincompose.ui.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.toyelabs.logincompose.R
import com.toyelabs.logincompose.theme.Dimens
import com.toyelabs.logincompose.theme.Transparent

@Composable
fun SignUpScreen(onSignUpClick: () -> Unit) {
    val primaryColor = MaterialTheme.colorScheme.primary
    val backgroundColor = MaterialTheme.colorScheme.background
    val textColor = MaterialTheme.colorScheme.onBackground

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Create an account",
                modifier = Modifier
                    .padding(horizontal = 40.dp),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 56.sp,
                color = textColor
            )
            Spacer(modifier = Modifier.size(32.dp))
            Text(
                text = "Sign up with",
                modifier = Modifier
                    .padding(horizontal = 40.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = textColor
            )

            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
            ) {
                CardSignup()
            }

            Spacer(modifier = Modifier.size(32.dp))

            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                val usernameTextState = remember { mutableStateOf("") }
                val emailTextState = remember { mutableStateOf("") }
                val passwordTextState = remember { mutableStateOf("") }

                TextFields(usernameTextState, "Username")
                TextFields(emailTextState, "Email")
                TextFields(passwordTextState, "Password")
            }

        }

        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(20.dp)
                .offset(y = -(30).dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Button(
                onClick = onSignUpClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .size(Dimens.buttonSize),
                shape = RoundedCornerShape(Dimens.buttonCornerCurve),
            ) {
                Text(text = "REGISTER", color = textColor)
            }
        }
    }
}

@Composable
private fun CardSignup() {
    val logoGoogle: Painter = painterResource(id = R.drawable.logo_google)
    val logoGithub: Painter = painterResource(id = R.drawable.logo_github)

    val primaryColor = MaterialTheme.colorScheme.primary
    val textColor = MaterialTheme.colorScheme.onBackground

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Card(
            modifier = Modifier
                .weight(1f)
                .border(3.dp, primaryColor, shape = RoundedCornerShape(Dimens.cardCornerCurve)),
            shape = RoundedCornerShape(Dimens.cardCornerCurve)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = logoGoogle,
                    contentDescription = "Google",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "Google",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = textColor
                )
            }
        }

        Spacer(modifier = Modifier.size(16.dp))

        Card(
            modifier = Modifier
                .weight(1f)
                .border(3.dp, primaryColor, shape = RoundedCornerShape(Dimens.cardCornerCurve)),
            shape = RoundedCornerShape(Dimens.cardCornerCurve)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = logoGithub,
                    contentDescription = "Github",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "Github",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = textColor
                )
            }
        }
    }
}

@Composable
private fun TextFields(textState: MutableState<String>, textFieldTitle: String) {
    val primaryColor = MaterialTheme.colorScheme.primary
    val textColor = MaterialTheme.colorScheme.onBackground

    Row {
        Text(
            text = textFieldTitle,
            modifier = Modifier
                .align(Alignment.Bottom),
            color = textColor,
        )

        Spacer(modifier = Modifier.size(16.dp))

        TextField(
            value = textState.value,
            onValueChange = { textState.value = it },
            modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Transparent,
                unfocusedContainerColor = Transparent
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
            ),
            singleLine = true
        )
    }
}

@Preview
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen(onSignUpClick = {})

}
