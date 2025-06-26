package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
            .padding(8.dp)
            .background(color = Pink80)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(40.dp))


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
    }




@Preview(showBackground = true)
@Composable
fun RachaScreenPreview() {
    IbudgetTheme {
        RachaScreen()
    }
}
