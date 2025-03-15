package com.example.uthsmarttasks.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.navigation.NavHostController
import com.example.uthsmarttasks.Footer
import com.example.uthsmarttasks.Header
import com.example.uthsmarttasks.R

@Composable
fun FirstScreen(navController: NavHostController) {
    Column {
        Header(1)
        Box(
            modifier = Modifier
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
            }
        }
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.White)
//        ) {
//            Button(
//                onClick = { navController.navigate("second") },
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color(0xFF42AFFF),
//                    contentColor = Color.White
//                ),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 25.dp,bottom = 37.dp, end = 25.dp, top = 160.dp)
//                    .height(50.dp)
//            ) {
//                Text(
//                    text = "Next",
//                    fontSize = 25.sp
//                )
//            }
//        }

        Footer(navController = navController, "second", "Next", showBackButton = false)
    }
}