package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.Pink80
import com.grupo2.ibudget.ui.theme.RosaPrincipal

@Composable
fun Login() {
    var showPassword by remember { mutableStateOf(false) }
    var usuario by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(60.dp)
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.animal),
            contentDescription = stringResource(R.string.login_pig_image_description),
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(R.string.login_title),
            color = Color.Black,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            value = usuario,
            onValueChange = { usuario = it },
            label = { Text(stringResource(R.string.login_username)) }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(stringResource(R.string.login_email)) }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            label = { Text(stringResource(R.string.login_password)) },
            trailingIcon = {
                val contentDescription = if (showPassword) {
                    stringResource(R.string.login_hide_password)
                } else {
                    stringResource(R.string.login_show_password)
                }

                Icon(
                    painter = painterResource(if (showPassword) R.drawable.ic_visibility_off else R.drawable.ic_visibility),
                    contentDescription = contentDescription,
                    modifier = Modifier.clickable { showPassword = !showPassword }
                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* TODO: Handle login */ },
            colors = ButtonDefaults.buttonColors(Pink80),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                stringResource(R.string.login_button),
                color = Color.Black,
                fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(
            onClick = { /* TODO: Handle navigation to registration */ },
            colors = ButtonDefaults.buttonColors(RosaPrincipal)
        ) {
            Text(
                stringResource(R.string.login_existing_account),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    IbudgetTheme {
        Login()
    }
}
