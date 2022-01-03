package com.ervalsa.emptyuistatepractice.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ervalsa.emptyuistatepractice.R
import com.ervalsa.emptyuistatepractice.ui.theme.Brown
import com.ervalsa.emptyuistatepractice.ui.theme.Green
import com.ervalsa.emptyuistatepractice.ui.theme.GreenSoft
import com.ervalsa.emptyuistatepractice.ui.theme.Yellow

@Composable
fun EmptyScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.White,
            shape = RoundedCornerShape(
                bottomEnd = 40.dp,
                bottomStart = 40.dp)
        ) {
            Image(
                modifier = Modifier
                    .padding(48.dp)
                    .size(280.dp),
                painter = painterResource(
                    R.drawable.ill_finance
                ),
                contentDescription = "Illustration Finance")
        }

        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = Green,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 50.dp),
                    text = "Start Reporting",
                    fontSize = 22.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier
                        .padding(end = 78.dp, start = 78.dp),
                    text = "Manage your business much better than before with us",
                    fontSize = 16.sp,
                    color = GreenSoft,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp)
                        .width(140.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Yellow)
                ) {
                    Text(
                        text = "Get Started",
                        fontSize = 14.sp,
                        color = Brown
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyScreenPreview() {
    EmptyScreen()
}