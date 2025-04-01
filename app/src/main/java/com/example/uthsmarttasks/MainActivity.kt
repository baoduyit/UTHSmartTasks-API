package com.example.uthsmarttasks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import com.example.uthsmarttasks.apiHandler.RetrofitInstance
import com.example.uthsmarttasks.ui.screens.AuthScreen
import com.example.uthsmarttasks.ui.screens.TaskDetailScreen
import com.example.uthsmarttasks.ui.screens.TaskScreen
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AuthScreen()
        }
    }
}

//        Log.d("API_DEBUG", "Starting API Call...") // Thêm log kiểm tra
//
//        lifecycleScope.launch {
//            try {
//                val response = RetrofitInstance.api.getTasks()
//                if (response.isSuccess) {
//                    response.data.forEach { task ->
//                        Log.d("API_TASK", "Title: ${task.title}, Description: ${task.description}, Status: ${task.status}")
//                    }
//                } else {
//                    Log.e("API_ERROR", "Failed to fetch tasks: ${response.message}")
//                }
//            } catch (e: Exception) {
//                Log.e("API_EXCEPTION", "Error: ${e.message}")
//            }
//        }
//    }
//}

