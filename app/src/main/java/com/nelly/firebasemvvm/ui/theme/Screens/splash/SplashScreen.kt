package com.nelly.firebasemvvm.ui.theme.Screens.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nelly.firebasemvvm.R
import com.nelly.firebasemvvm.navigation.ROUTE_HOME
import com.nelly.firebasemvvm.ui.theme.Screens.login.LoginScreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
//    Delay to simulate splash screen duration
    LaunchedEffect(Unit) {
//        2 seconds delay
        delay(2000)
        navController.navigate(ROUTE_HOME)

    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center)
    {
        Image(painter = painterResource(id = R.drawable.jumia), contentDescription = "Splash Logo",
//            Adjust size as needed
            modifier = Modifier.size(200.dp)
        )
    }

}

@Preview
@Composable
fun Splashpage() {
    SplashScreen(rememberNavController())
}