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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
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
import com.grupo2.ibudget.ui.ItemMenu
import com.grupo2.ibudget.ui.theme.BlancoFull
import com.grupo2.ibudget.ui.theme.PaulaPink
import com.grupo2.ibudget.ui.theme.Pink80
import com.grupo2.ibudget.ui.theme.RosaClaro
import com.grupo2.ibudget.ui.theme.RosaIntenso


@Composable
fun Menu() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BlancoFull)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Menu",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(30.dp))

        ItemMenu(imagen = R.drawable.casita, titulo = "Inicio")

        Spacer(modifier = Modifier.height(20.dp))

        ItemMenu(imagen = R.drawable.presu, titulo = "Presupuesto")

        Spacer(modifier = Modifier.height(20.dp))

        ItemMenu(imagen = R.drawable.meta, titulo = "Agregar nueva meta")

        Spacer(modifier = Modifier.height(20.dp))

        ItemMenu(imagen = R.drawable.presu, titulo = "Agregar presupuesto")

        Spacer(modifier = Modifier.height(20.dp))


        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Text(
                    text = " Cambiar de cuenta",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                )



            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Text(
                    text = " Cerrar sesión",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                )



            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    Menu()
}
