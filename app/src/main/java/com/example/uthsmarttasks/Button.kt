package com.example.uthsmarttasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun ButtonScreen(navController: NavController, route: String, textButton1: String){
    Box(
        modifier = Modifier
            .background(Color.White)
    ){
        Button(
            onClick = {navController.navigate(route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 75.dp, end = 25.dp, bottom = 30.dp, top = 165.dp)
                .height(50.dp)
        ) {
            Text(
                text = textButton1,
                fontSize = 25.sp
            )
        }
    }
}