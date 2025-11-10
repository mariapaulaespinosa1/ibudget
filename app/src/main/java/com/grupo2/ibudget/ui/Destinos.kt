package com.grupo2.ibudget.ui

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import com.grupo2.ibudget.R

enum class Destinos(
    val route: String,
    val label: String,
    val icon: Int,
    val contentDescription: String
) {
    HOME(
        route = "home",
        label = "Home",
        icon = R.drawable.casita,
        contentDescription = "Home"
    ),
    PRESUPUESTOS(
        route = "presupuestos",
        label = "Presupuestos",
        icon = R.drawable.calendario,
        "Presupuestos"
    ),
    GASTOS(
        route = "gastos",
        label = "Gastos",
        icon = R.drawable.barra,
        "Gastos"
    ),
    CUENTAS(
        route = "cuentas",
        label = "Cuentas",
        icon = R.drawable.tarjeta,
        "Cuentas"
    ),
    Menu(
        route = "menu",
        label = "Menu",
        icon = R.drawable.ajuste,
        "Menu"
    ),
}