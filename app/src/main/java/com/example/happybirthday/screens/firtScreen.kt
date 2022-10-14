package com.example.happybirthday.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.happybirthday.navigation.AppNavigation
import com.example.happybirthday.navigation.AppScreens

@Composable
fun  FirtScreen(navController: NavController){
    Scaffold {
        BodyContent(navController)
    }
}
@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla Inicial")
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
            Text(text = "Pagina 2")
        }
        Button(onClick = {navController.navigate(route = AppScreens.ThreeScreen.route)}) {
            Text(text = "Pagina 3")
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun PreviewBodyContent(){
    FirtScreen()
}
*/