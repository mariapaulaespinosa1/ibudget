package com.grupo2.ibudget.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.Pink80


@Composable
fun MainScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.fire_anim))
    val progress by animateLottieCompositionAsState(composition)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Pink80)
                .padding(20.dp)

        ) {
            LottieAnimation(
                modifier = Modifier
                    .size(45.dp)
                    .clickable {

                    }
                    .align(Alignment.CenterStart),
                composition = composition,
                progress = { progress },
            )


            IconButton(onClick = {

            }, modifier = Modifier.align(Alignment.CenterEnd)) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "Configuración")
            }

            Spacer(modifier = Modifier.height(40.dp))


        }

        Spacer(modifier = Modifier.height((20.dp)))

        Text(
            text = "Calendario",
            color = Color.Black,
            fontSize = 50.sp, fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))


        Card(onClick = {
        }, modifier = Modifier.size(300.dp)) {
            Image(
                painter = painterResource(R.drawable.ic_calendario),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )


        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            ElevatedCard(modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .weight(1f)) {
                Text(text = "OBJTIVOS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }

            ElevatedCard(modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .weight(1f)
            ) {
                Text(
                    text = "AHORROS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}