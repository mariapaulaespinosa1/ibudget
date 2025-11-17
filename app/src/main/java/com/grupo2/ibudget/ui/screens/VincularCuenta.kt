package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.Pink80

@Composable
fun VincularCuenta() {
    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(R.string.link_account_title),
            color = Pink80, fontSize = 40.sp,
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(id = R.drawable.cerdo),
            contentDescription = stringResource(R.string.link_account_pig_image_description),
            modifier = Modifier.size(300.dp), contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /* TODO: Handle Google sign-in */ },
            colors = ButtonDefaults.buttonColors(Pink80),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.usuario),
                contentDescription = stringResource(R.string.google_icon_description),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                stringResource(R.string.link_account_google_button), color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /* TODO: Handle other sign-in methods */ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            border = BorderStroke(width = 2.dp, color = Color.Gray)
        ) {
            Text(
                text = stringResource(R.string.link_account_other_button),
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun VincularCuentaPreview() {
    IbudgetTheme {
        VincularCuenta()
    }
}
