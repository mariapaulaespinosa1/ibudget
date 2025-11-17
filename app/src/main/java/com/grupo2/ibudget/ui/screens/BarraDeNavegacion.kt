package com.grupo2.ibudget.ui.screens

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaPrincipal

private data class BottomNavItem(
    val label: String,
    val iconRes: Int,
    val route: String
)

@Composable
fun BarraDeNavegacion() {
    val items = listOf(
        BottomNavItem(stringResource(R.string.bottom_nav_presupuesto), R.drawable.calendario, "presupuesto"),
        BottomNavItem(stringResource(R.string.bottom_nav_gastos), R.drawable.barra, "gastos"),
        BottomNavItem(stringResource(R.string.bottom_nav_cuentas), R.drawable.tarjeta, "cuentas"),
        BottomNavItem(stringResource(R.string.bottom_nav_menu), R.drawable.ajuste, "menu")
    )
    var selectedItem by remember { mutableIntStateOf(0) }

    NavigationBar(
        containerColor = RosaPrincipal,
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                label = { Text(item.label, color = Color.White) },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconRes),
                        contentDescription = item.label,
                        tint = Color.White
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = RosaPrincipal,
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.White.copy(alpha = 0.6f)
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BarraDeNavegacionPreview() {
    IbudgetTheme {
        BarraDeNavegacion()
    }
}