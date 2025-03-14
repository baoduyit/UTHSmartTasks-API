package com.example.uthsmarttasks.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uthsmarttasks.R

@Composable
fun FirstScreen() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.screen1),
                    contentDescription = "Centered Image",
                    modifier = Modifier
                        .size(400.dp)
                        .padding(25.dp)
                )
                Text(
                    text = "Easy Time Management",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first ",
                    fontSize = 20.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(25.dp)
                )

                Spacer(modifier = Modifier.width(100.dp))

                Button(
                    onClick = {  },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF42AFFF),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .padding(bottom = 40.dp)
                        .fillMaxWidth()
                        .padding(start = 25.dp, end = 25.dp, bottom = 20.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Next",
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}