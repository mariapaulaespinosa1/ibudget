package com.grupo2.ibudget.ui.screens

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text2.BasicSecureTextField
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.foundation.text2.input.TextObfuscationMode
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
import com.grupo2.ibudget.ui.theme.Pink40
import com.grupo2.ibudget.ui.theme.Pink80


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Login() {

    val state = remember { TextFieldState() }
    var showPassword by remember { mutableStateOf(false) }
    var usuario by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(60.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.animal),
            contentDescription = "Cerdito Rosadito",
            modifier = Modifier.size(300.dp), contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Registrate",
            color = Color.Black, fontSize = 50.sp,
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            value = usuario,
            onValueChange = {
                usuario = it
            },
            label = { Text("Nombre de usuario") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = { Text("Email") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = contrasena,
            onValueChange = {
                contrasena = it
            },
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            label = { Text("Contraseña") },
            trailingIcon = {
                Icon(
                    painter = painterResource(if (showPassword) R.drawable.ic_visibility_off else R.drawable.ic_visibility),
                    contentDescription = "Ver contraseña",
                    modifier = Modifier.clickable {
                        showPassword = !showPassword
                    }
                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { }, colors = ButtonDefaults.buttonColors(Pink80),
            modifier = Modifier.fillMaxWidth(), ) {
            Text(
                "Registrarse",color = Color.Black, fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(
            onClick = { }, colors = ButtonDefaults.buttonColors(Color.Transparent)

            ) {
            Text(
                " ¿ya tienes una cuenta? inicia sesion", color = Color.Black)

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




