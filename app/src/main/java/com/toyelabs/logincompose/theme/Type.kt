package com.toyelabs.logincompose.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.toyelabs.logincompose.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val DotoFontFamily = FontFamily(
    Font(R.font.doto_black, FontWeight.Black),
    Font(R.font.doto_bold, FontWeight.Bold),
    Font(R.font.doto_extrabold, FontWeight.ExtraBold),
    Font(R.font.doto_extralight, FontWeight.ExtraLight),
    Font(R.font.doto_light, FontWeight.Light),
    Font(R.font.doto_medium, FontWeight.Medium),
    Font(R.font.doto_regular, FontWeight.Normal),
    Font(R.font.doto_semibold, FontWeight.SemiBold),
    Font(R.font.doto_thin, FontWeight.Thin)
)

val DotoRoundedFontFamily = FontFamily(
    Font(R.font.doto_rounded_black, FontWeight.Black),
    Font(R.font.doto_rounded_bold, FontWeight.Bold),
    Font(R.font.doto_rounded_extrabold, FontWeight.ExtraBold),
    Font(R.font.doto_rounded_extralight, FontWeight.ExtraLight),
    Font(R.font.doto_rounded_light, FontWeight.Light),
    Font(R.font.doto_rounded_medium, FontWeight.Medium),
    Font(R.font.doto_rounded_regular, FontWeight.Normal),
    Font(R.font.doto_rounded_semibold, FontWeight.SemiBold),
    Font(R.font.doto_rounded_thin, FontWeight.Thin)
)
