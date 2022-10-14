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
fun  ThreeScreen(navController: NavController){
    Scaffold  (
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Tercera pantalla")
            }
        }
    ){
        threeBodyContent(navController)
    }
}
@Composable
fun threeBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tercera Pantalla")
        Button(onClick = { navController.navigate(route = AppScreens.FisrtScreen.route)}) {
            Text(text = "Regresar primera Pantalla")
        }
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
            Text(text = "Regresar Segunda Pantalla")
        }

    }
}

