package com.toyelabs.logincompose.ui.getstarted

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.toyelabs.logincompose.R
import com.toyelabs.logincompose.theme.DotoFontFamily
import com.toyelabs.logincompose.theme.Gray100

@Composable
fun GetStartedScreen(onGetStartedClick: () -> Unit) {
    val primaryColor = MaterialTheme.colorScheme.primary
    val backgroundPainter = painterResource(R.drawable.wenay_anime)
    val backgroundColor = MaterialTheme.colorScheme.background
    val textColor = MaterialTheme.colorScheme.onBackground

    val searchIcon = painterResource(id = R.drawable.baseline_saved_search_24)
    val bookIcon = painterResource(id = R.drawable.book_ribbon_24)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 32.dp),
        ) {
            ScatteredIcons()
        }
        Column(
            Modifier
                .fillMaxWidth()
                .offset(y = 64.dp),
        ) {
            Text(
                text = "Welcome to",
                modifier = Modifier
                    .padding(top = 32.dp, start = 16.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = textColor
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = primaryColor
                        )
                    ) { append("B") }
                    append("ook")
                },
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(end = 32.dp),
                fontSize = 94.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontFamily = DotoFontFamily,
                color = textColor
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = primaryColor
                        )
                    ) { append("L") }
                    append("abs")
                },
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 32.dp)
                    .offset(y = (-28).dp),
                fontSize = 84.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontFamily = DotoFontFamily,
                color = textColor
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = backgroundPainter,
                    contentDescription = "Background",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Reading is the key to Infinite Knowledge",
                        color = Gray100,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = "~Senior Mannan",
                        modifier = Modifier.align(Alignment.End),
                        color = Gray100,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                    )

                    Button(
                        onClick = onGetStartedClick,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.33f)
                            .padding(start = 32.dp, end = 32.dp, top = 16.dp, bottom = 64.dp),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text(text = "GET STARTED", color = textColor)
                    }
                }
            }
        }
    }
}

@Composable
fun ScatteredIcons() {
    val icons = listOf(
        R.drawable.baseline_saved_search_24,
        R.drawable.book_ribbon_24
    )

    // Generate random positions and rotations
    val random = remember { kotlin.random.Random.Default }
    val positionsAndRotations = remember {
        List(20) { // Explicitly specify the type
            Pair(
                Offset(
                    x = random.nextInt(0, 300).toFloat(), // Adjust based on screen width
                    y = random.nextInt(0, 300).toFloat() // Adjust based on screen height
                ),
                random.nextFloat() * 360f // Rotation angle
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        positionsAndRotations.forEachIndexed { index, (offset, rotation) ->
            val iconRes = icons[index % icons.size]
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = "Scattered Icon",
                modifier = Modifier
                    .size(24.dp)
                    .graphicsLayer(rotationZ = rotation)
                    .offset(x = offset.x.dp, y = offset.y.dp),
                alpha = 0.3f
            )
        }
    }
}

@Preview()
@Composable
fun PreviewGetStartedScreen() {
    GetStartedScreen(onGetStartedClick = {})
}
