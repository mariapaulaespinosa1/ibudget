package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.Pink80

@Composable
fun RachaScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.fire_anim))
    val progress by animateLottieCompositionAsState(composition)
    Column(
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

                    }
                    ,
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
                progress = {progress},
            )

            IconButton(onClick =  {

            }, modifier = Modifier
                .align(Alignment.CenterEnd)) {
                Icon(imageVector = Icons.Default.Settings,
                    contentDescription = "Configuracion")
            }
            Spacer(modifier = Modifier.height(20.dp))



            Row (modifier= Modifier
                .padding(24.dp)
                .background(color = Pink80)) {

            }


        }
    }




@Preview(showBackground = true)
@Composable
fun RachaScreenPreview() {
    IbudgetTheme {
        RachaScreen()
    }
}
