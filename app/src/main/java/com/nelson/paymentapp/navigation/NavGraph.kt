package com.nelson.paymentapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nelson.paymentapp.home.HomeScrn
import com.nelson.paymentapp.login.login
import com.nelson.paymentapp.payment.PaymentScrn

@Composable
fun NavGraphSetup(
    navController: NavHostController
){

   NavHost(
       navController = navController,
       startDestination = Screens.Login.route
   ){
       composable(route = Screens.Login.route){
           login(navController)
       }
       composable(route = Screens.Home.route){
           HomeScrn(navController)
       }
       composable(route = Screens.Payments.route){
           PaymentScrn()
       }
   }
}