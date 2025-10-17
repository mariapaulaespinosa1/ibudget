package com.grupo2.ibudget.ui

import com.grupo2.ibudget.R

enum class Destinos(
    val route: String,
    val label: String,
    val icon: Int,
    val contentDescription: String
) {
    PRESUPUESTOS(route = "presupuestos", label = "Presupuestos", icon = R.drawable.calendario,"Presupuestos"),
    GASTOS(route = "gastos", label = "Gastos", icon = R.drawable.barra,"Gastos"),
    CUENTAS(route = "cuentas", label = "Cuentas", icon = R.drawable.tarjeta,"Cuentas"),
    AJUSTES(route = "ajustes", label = "Ajustes", icon = R.drawable.ajuste, "Ajustes")


}

enum class Destination(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val contentDescription: String
) {
    SONGS("songs", "Songs", Icons.Default.MusicNote, "Songs"),
    ALBUM("album", "Album", Icons.Default.Album, "Album"),
    PLAYLISTS("playlist", "Playlist", Icons.Default.PlaylistAddCircle, "Playlist")
}