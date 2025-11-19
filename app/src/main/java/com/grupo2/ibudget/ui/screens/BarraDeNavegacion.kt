package com.grupo2.ibudget.ui.screens

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.grupo2.ibudget.ui.Destinos
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaPrincipal

@Composable
fun BarraDeNavegacion(selectedDestination: Int, onNavigate: (Int, String) -> Unit) {
    val items = Destinos.entries

    NavigationBar(
        containerColor = RosaPrincipal,
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedDestination == index,
                onClick = { onNavigate(index, item.route) },
                label = { Text(stringResource(item.label), color = Color.White) },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = stringResource(item.contentDescription),
                        tint = Color.White
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = RosaPrincipal,
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BarraDeNavegacionPreview() {
    IbudgetTheme {
        BarraDeNavegacion(selectedDestination = 0, onNavigate = { _, _ -> })
    }
}
