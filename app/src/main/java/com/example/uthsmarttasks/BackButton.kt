package com.example.uthsmarttasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun ButtonBack(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color.White)
    ){
        Button(
            onClick = {navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFF42AFFF), CircleShape)
        ) {
            Text(
                text = "<-",
                fontSize = 25.sp
            )
        }
    }
}