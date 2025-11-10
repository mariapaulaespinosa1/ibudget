package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro

@Composable

fun BarraDeNavegacion() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(R.drawable.calendario),
                    contentDescription = "calendario",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(15.dp)
                )
            }
            Text(text = "Presupuesto", color = Color.Black, fontSize = 11.sp)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(R.drawable.barra),
                    contentDescription = "barra",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(15.dp)
                )
            }
            Text(text = "Gastos", color = Color.Black, fontSize = 11.sp)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(R.drawable.tarjeta),
                    contentDescription = "tarjeta",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(15.dp)
                )
            }
            Text(text = "Cuentas", color = Color.Black, fontSize = 11.sp)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(R.drawable.ajuste),
                    contentDescription = "ajuste",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(15.dp)
                )
            }
            Text(text = "Menu", color = Color.Black, fontSize = 11.sp)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BarraDeNavegacionPreview() {
    IbudgetTheme {
        BarraDeNavegacion()
    }
}