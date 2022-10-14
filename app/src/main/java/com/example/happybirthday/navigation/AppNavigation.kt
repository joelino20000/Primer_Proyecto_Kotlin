package com.example.happybirthday.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.happybirthday.screens.FirtScreen
import com.example.happybirthday.screens.SecondScreen
import com.example.happybirthday.screens.ThreeScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController= navController,
        startDestination = AppScreens.FisrtScreen.route,
        ){
        composable(route = AppScreens.FisrtScreen.route){
            FirtScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThreeScreen.route){
            ThreeScreen(navController)
        }
    }
}