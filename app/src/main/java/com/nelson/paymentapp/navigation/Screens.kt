package com.nelson.paymentapp.navigation

sealed class Screens(val route:String){
    object Home:Screens("home_screen")
    object Login:Screens("login_screen")
    object Payments:Screens("payment_screen")
}
