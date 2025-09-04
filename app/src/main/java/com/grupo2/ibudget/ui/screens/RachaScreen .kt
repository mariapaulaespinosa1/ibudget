package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
fun RachaScreen() {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.fire_anim))
    val progress by animateLottieCompositionAsState(composition)
    val dias by remember { mutableStateOf(20) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink80)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(
            modifier = Modifier
                .size(250.dp)
                .clickable {

                },
            composition = composition,
            progress = { progress },
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "$dias",

            fontWeight = FontWeight.Bold,
            fontSize = 70.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Dias De Racha",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(30.dp))

        ElevatedCard(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "D", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.Cyan
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "L", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "Ma", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "Mi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "J", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "V", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "S", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.check_circle),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }
               Spacer(modifier = Modifier.height(90.dp))

        Button(
            onClick =  { }, colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.fillMaxWidth(), ) {

            Text(
                "Comparte tu logro",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

            )


            }



        Spacer(modifier = Modifier.height(20.dp))

        TextButton(
            onClick = { }, colors = ButtonDefaults.buttonColors(Color.Transparent)
        ) {
            Text(
                "CONTINUAR", color = Color.Black, fontSize = 20.sp
            )
        }

    }
    /*Column(
        modifier = Modifier
            .padding()
            .background(color = Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(70.dp))


        LottieAnimation(
            modifier = Modifier
                .size(350.dp)
                .clickable {

                },
            composition = composition,
            progress = { progress }
        )
    }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Pink80)
            .padding(20.dp)
    ) {
        LottieAnimation(
            modifier = Modifier
                .size(50.dp)
                .clickable {

                }
                .align(Alignment.CenterStart),
            composition = composition,
            progress = { progress },
        )

        IconButton(
            onClick = {

            }, modifier = Modifier
                .align(Alignment.CenterEnd)
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Configuracion"
            )
        }
        Spacer(modifier = Modifier.height(20.dp))



        Row(
            modifier = Modifier
                .padding(24.dp)
                .background(color = Pink80)
        ) {

        }


    }*/
}


@Preview(showBackground = true)
@Composable
fun RachaScreenPreview() {
    RachaScreen()
}
