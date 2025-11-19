package com.grupo2.ibudget.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.grupo2.ibudget.R

enum class Destinos(
    val route: String,
    @get:StringRes val label: Int,
    @get:DrawableRes val icon: Int,
    @get:StringRes val contentDescription: Int
) {
    HOME(
        route = "home",
        label = R.string.destination_home,
        icon = R.drawable.casita,
        contentDescription = R.string.destination_home
    ),
    PRESUPUESTOS(
        route = "presupuestos",
        label = R.string.destination_presupuestos,
        icon = R.drawable.calendario,
        contentDescription = R.string.destination_presupuestos
    ),
    GASTOS(
        route = "gastos",
        label = R.string.destination_gastos,
        icon = R.drawable.barra,
        contentDescription = R.string.destination_gastos
    ),
    CUENTAS(
        route = "cuentas",
        label = R.string.destination_cuentas,
        icon = R.drawable.tarjeta,
        contentDescription = R.string.destination_cuentas
    ),
    MENU(
        route = "menu",
        label = R.string.destination_menu,
        icon = R.drawable.ajuste,
        contentDescription = R.string.destination_menu
    ),
    METAS(
        route = "metas",
        label = R.string.main_screen_goals,
        icon = R.drawable.meta,
        contentDescription = R.string.main_screen_goals
    )
}