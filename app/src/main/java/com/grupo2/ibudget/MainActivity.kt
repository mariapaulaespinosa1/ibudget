package com.grupo2.ibudget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.grupo2.ibudget.ui.Destinos
import com.grupo2.ibudget.ui.screens.AhorrosScreen
import com.grupo2.ibudget.ui.screens.DialogoRegistro
import com.grupo2.ibudget.ui.screens.Gastos
import com.grupo2.ibudget.ui.screens.MainScreen
import com.grupo2.ibudget.ui.screens.MenuScreen
import com.grupo2.ibudget.ui.screens.PresupuestoScreen
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IBudgetApp()
        }
    }
}

@Suppress("UNUSED_CHANGED_VALUE")
@Composable
fun IBudgetApp() {
    val navController = rememberNavController()

    val startDestination = Destinos.HOME
    var selectedDestination by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }

    val budgetViewModel: BudgetViewModel = viewModel()

    var mostrarDialogoRegistro by remember {
        mutableStateOf(false)
    }

    IbudgetTheme {
        Scaffold(modifier = Modifier.fillMaxSize(), floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {
                    mostrarDialogoRegistro = true
                },
                containerColor = RosaPrincipal,
                icon = { Icon(Icons.Filled.Add, "Extended floating action button.") },
                text = { Text(text = "Agregar") },
            )
        }, bottomBar = {
            NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
                Destinos.entries.forEachIndexed { index, destination ->
                    NavigationBarItem(
                        selected = selectedDestination == index,
                        onClick = {
                            navController.navigate(route = destination.route)
                            selectedDestination = index
                        },
                        icon = {
                            Icon(
                                painter = painterResource(destination.icon),
                                contentDescription = stringResource(destination.contentDescription)
                            )
                        },
                        label = { Text(stringResource(destination.label)) }
                    )

                }
            }
        }) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = startDestination.route,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(route = Destinos.HOME.route) {
                    MainScreen()
                }
                composable(route = Destinos.PRESUPUESTOS.route) {
                    PresupuestoScreen(onBack = { navController.popBackStack() })
                }
                composable(route = Destinos.GASTOS.route) {
                    Gastos(budgetViewModel = budgetViewModel, onBack = { navController.popBackStack() })
                }
                composable(route = Destinos.CUENTAS.route) {
                    AhorrosScreen(onBack = { navController.popBackStack() })
                }
                composable(route = Destinos.MENU.route) {
                    MenuScreen(onBack = { navController.popBackStack() })
                }
            }
            if (mostrarDialogoRegistro) {
                DialogoRegistro(onDismissRequest = {
                    mostrarDialogoRegistro = false
                }, onIngresar = { gasto ->
                    mostrarDialogoRegistro = false
                    budgetViewModel.anadirGasto(gasto)
                })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IBudgetAppPreview() {
    IBudgetApp()
}
