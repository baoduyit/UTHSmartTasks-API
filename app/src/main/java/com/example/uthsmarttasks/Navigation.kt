package com.example.uthsmarttasks

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uthsmarttasks.ui.screens.FirstScreen
import com.example.uthsmarttasks.ui.screens.SecondScreen
import com.example.uthsmarttasks.ui.screens.SplashScreen
import com.example.uthsmarttasks.ui.screens.TaskDetailScreen
import com.example.uthsmarttasks.ui.screens.TaskScreen
import com.example.uthsmarttasks.ui.screens.ThirdScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController)}
        composable("first") { FirstScreen(navController) }
        composable("second") { SecondScreen(navController) }
        composable("third") { ThirdScreen(navController) }
        composable("taskScreen") { TaskScreen(navController) }
        composable("taskDetail/{taskId}") { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")?.toIntOrNull()
            if (taskId != null) {
                TaskDetailScreen(taskId)
            }
        }

    }
}
