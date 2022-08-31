package com.nelson.paymentapp.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nelson.paymentapp.navigation.Screens

@Composable
fun HomeScrn(
    navController: NavController
){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(20.dp), 
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Payments")
        }
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom) {
            FloatingActionButton(
                onClick = {
                    navController.navigate(route = Screens.Payments.route)
                },
                modifier = Modifier.size(60.dp),
                shape = CircleShape, backgroundColor = Color.Gray
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "AddPayment",
                    tint= Color.White
                )
            }
        }
    }
}