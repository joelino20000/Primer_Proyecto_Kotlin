package com.example.happybirthday.navigation

sealed class AppScreens(val route: String){
    object FisrtScreen: AppScreens(route = "firtScreen")
    object SecondScreen : AppScreens(route = "secondScreen")
    object ThreeScreen : AppScreens(route = "ThreeScreen")
}
