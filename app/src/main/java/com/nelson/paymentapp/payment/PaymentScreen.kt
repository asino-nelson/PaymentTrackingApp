package com.nelson.paymentapp.payment

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun PaymentScrn(){
    Surface(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = "",
                onValueChange ={ /*TODO*/ } ,
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text="Sender") },
                shape = RoundedCornerShape(30.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "",
                onValueChange ={ /*TODO*/ } ,
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text="Recipient") },
                shape = RoundedCornerShape(30.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange ={ /*TODO*/ } ,
                    modifier = Modifier.width(150.dp),
                    label = { Text(text="Date")},
                    shape = RoundedCornerShape(30.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange ={ /*TODO*/ } ,
                    label = { Text(text="Amount") },
                    shape = RoundedCornerShape(30.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ },
                modifier=Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(text = "Make Payment")
            }
        }
    }
}