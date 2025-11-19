package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro
import com.grupo2.ibudget.ui.theme.RosaPrincipal

@Composable
fun DialogoRegistro(onDismissRequest: () -> Unit, onIngresar: (Gasto) -> Unit = {}) {
    var valor by remember {
        mutableStateOf("")
    }
    var descripcion by remember {
        mutableStateOf("")
    }
    var isValorError by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = onDismissRequest) {
        Card(
            colors = CardDefaults.cardColors(containerColor = RosaClaro),
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = stringResource(R.string.dialogo_registro_title),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 30.sp
                )

                TextField(
                    value = valor,
                    onValueChange = {
                        valor = it
                        isValorError = false
                    },
                    isError = isValorError,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = RosaClaro,
                        unfocusedContainerColor = RosaClaro
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(R.string.dialogo_registro_valor_label)) },
                    placeholder = { Text(text = stringResource(R.string.dialogo_registro_valor_placeholder)) }
                )

                TextField(
                    value = descripcion,
                    onValueChange = { descripcion = it },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = RosaClaro,
                        unfocusedContainerColor = RosaClaro
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(R.string.dialogo_registro_descripcion_label)) },
                    placeholder = { Text(text = stringResource(R.string.dialogo_registro_descripcion_placeholder)) }
                )

                Button(
                    onClick = {
                        val valorInt = valor.toIntOrNull()
                        if (valorInt != null) {
                            val gasto = Gasto(valor = valorInt, descripcion = descripcion)
                            onIngresar(gasto)
                        } else {
                            isValorError = true
                        }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = RosaPrincipal),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = stringResource(R.string.dialogo_registro_ingresar_button))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DialogoRegistroPreview() {
    IbudgetTheme {
        var valor by remember {
            mutableStateOf("")
        }
        var descripcion by remember {
            mutableStateOf("")
        }

        Card(
            colors = CardDefaults.cardColors(containerColor = RosaClaro),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = stringResource(R.string.dialogo_registro_title),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 30.sp
                )

                TextField(
                    value = valor,
                    onValueChange = { valor = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = RosaClaro,
                        unfocusedContainerColor = RosaClaro
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(R.string.dialogo_registro_valor_label)) },
                    placeholder = { Text(text = stringResource(R.string.dialogo_registro_valor_placeholder)) }
                )

                TextField(
                    value = descripcion,
                    onValueChange = { descripcion = it },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = RosaClaro,
                        unfocusedContainerColor = RosaClaro
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(R.string.dialogo_registro_descripcion_label)) },
                    placeholder = { Text(text = stringResource(R.string.dialogo_registro_descripcion_placeholder)) }
                )

                Button(
                    onClick = { /* No-op for preview */ },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = RosaPrincipal),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = stringResource(R.string.dialogo_registro_ingresar_button))
                }
            }
        }
    }
}

data class Gasto(val valor: Int, val descripcion: String)