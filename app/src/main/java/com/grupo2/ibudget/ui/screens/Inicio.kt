package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro

@Composable
fun Inicio() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = RosaClaro),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.inicio),
            contentDescription = "Cerdito Rosadito",
            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Fit

        )

    }


}


@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    IbudgetTheme {
        Inicio()
    }
}