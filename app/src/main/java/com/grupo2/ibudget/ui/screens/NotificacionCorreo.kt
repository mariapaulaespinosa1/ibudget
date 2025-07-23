package com.grupo2.ibudget.ui.screens

import androidx.compose.runtime.Composable

@Composable

fun RegistroScreen() {
    val titulo = "Titulo del registro"
    val descripcion = "Descripcion del registro"
    val email = "corrreo@example.com"

    NotificacionCorreo(
        titulo = titulo,
        descripcion = descripcion,
        email = email,
        onEnviarNotificacion = {
            // Logica adicional despues de enviar la notificacion 
        }
    )
}

@Composable
fun NotificacionCorreo(titulo: String, descripcion: String, email: String, onEnviarNotificacion: () -> Unit) {

}

                                                   