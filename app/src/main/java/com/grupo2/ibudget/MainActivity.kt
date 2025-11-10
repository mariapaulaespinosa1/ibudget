package com.grupo2.ibudget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.grupo2.ibudget.ui.Destinos
import com.grupo2.ibudget.ui.screens.Gastos
import com.grupo2.ibudget.ui.screens.iBudget
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            val startDestination = Destinos.HOME
            var selectedDestination by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }


            IbudgetTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), floatingActionButton = {
                    ExtendedFloatingActionButton(
                        onClick = {

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
                                        contentDescription = destination.contentDescription
                                    )
                                },
                                label = { Text(destination.label) }
                            )

                        }
                    }
                }) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = startDestination.route,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = "home") {
                            Gastos()
                        }
                        composable(route = "presupuestos") {
                            iBudget()
                        }
                        composable(route = "gastos") {
                            Gastos()

                        }
                        composable(route = "cuentas"){

                        }
                        composable(route = "menu") {

                        }


                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IbudgetTheme {
        Greeting("Android")
    }
}