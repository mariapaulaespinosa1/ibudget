package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.Pink80

@Composable
fun Vincularcuenta() {
    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Iniciar sesion",
            color = Pink80, fontSize = 40.sp,
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(id = R.drawable.cerdo),
            contentDescription = "cerdo",
            modifier = Modifier.size(300.dp), contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))







        Spacer(modifier = Modifier.height(40.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { }, colors = ButtonDefaults.buttonColors(Pink80),
        ) {

            Text(
                "Registrarse", color = Color.Black,
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(40.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { }, colors = ButtonDefaults
                .buttonColors(Color.Transparent),
            border = BorderStroke(width = 2.dp, color = Color.Gray)
        ) {
            Text(
                text = "Otro",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )

        }
    }


}


@Preview(showBackground = true)
@Composable
fun VincularcuentaPreview() {
    IbudgetTheme {
        Vincularcuenta()
    }
}
