package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro

@Composable
fun Ahorros() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = RosaClaro)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Ahorros",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )



            Image(
                painter = painterResource(R.drawable.animal),
                contentDescription = "cerdito",
                modifier = Modifier.size(70.dp)
            )


        }


    }


}


@Preview(showBackground = true)
@Composable
fun AhorrosPreview() {
    IbudgetTheme {
        Ahorros()

    }
}