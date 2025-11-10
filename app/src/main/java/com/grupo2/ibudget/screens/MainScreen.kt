package com.grupo2.ibudget.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.BlancoFull
import com.grupo2.ibudget.ui.theme.RosaClaro


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.fire_anim))
    val progress by animateLottieCompositionAsState(composition)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = RosaClaro)
    ) {

        Column(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = RosaClaro)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "iBudget",
                color = Color.Black,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(count = 2),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Categoria(imagen = R.drawable.animal, label = "Ahorros", onClick = {})
                }
                item {
                    Categoria(imagen = R.drawable.flecha, label = "Presupuesto", onClick = {})
                }
                item {
                    Categoria(imagen = R.drawable.libret, label = "Gastos", onClick = {})
                }
                item {
                    Categoria(imagen = R.drawable.meta, label = "Metas", onClick = {})
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            ElevatedCard {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp), verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.usuario),
                        contentDescription = "Consejos "
                    )
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Consejos de ahorro",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "Aprende a administrar tus finanzas",
                            color = Color.Black,
                            fontSize = 16.sp
                        )

                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}