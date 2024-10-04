package com.nelly.firebasemvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nelly.firebasemvvm.ui.theme.Screens.home.HomeScreen
import com.nelly.firebasemvvm.ui.theme.Screens.login.LoginScreen
import com.nelly.firebasemvvm.ui.theme.Screens.products.AddProductsScreen
import com.nelly.firebasemvvm.ui.theme.Screens.products.UpdateProductsScreen
import com.nelly.firebasemvvm.ui.theme.Screens.products.ViewProductsScreen
import com.nelly.firebasemvvm.ui.theme.Screens.products.ViewUploadsScreen
import com.nelly.firebasemvvm.ui.theme.Screens.register.RegisterScreen
import com.nelly.firebasemvvm.ui.theme.Screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),startDestination: String = ROUTE_SPLASH) {

    NavHost(navController = navController, modifier= modifier, startDestination = ROUTE_SPLASH){
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }

    }

}