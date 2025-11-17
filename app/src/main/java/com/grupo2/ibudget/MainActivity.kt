package com.grupo2.ibudget

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
>>>>>>> 632e0cc ("se realizo la pantalla de Ahorro  ")
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.preferencesDataStoreFile
import androidx.lifecycle.lifecycleScope
import com.grupo2.ibudget.screens.MainScreen
import com.grupo2.ibudget.ui.theme.RosaClaro
import com.grupo2.ibudget.ui.theme.RosaIntenso
import com.grupo2.ibudget.ui.theme.RosaMasClaro
import com.grupo2.ibudget.ui.theme.RosaOscuro
import com.grupo2.ibudget.ui.theme.RosaPrincipal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.ZoneId

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

enum class RACHA {
    SIGUIENTE_DIA, MISMO_DIA, OTRO_DIA
}
>>>>>>> 53fb455 ("se agg una racha "")

class MainActivity : ComponentActivity() {

    val DIAS_RACHA = intPreferencesKey("dias_racha")
    val ULTIMO_DIA = longPreferencesKey("ultimo_dia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD

        lifecycleScope.launch {
            this@MainActivity.dataStore.data.collect { preferences ->
                val ultimoDia = preferences[ULTIMO_DIA] ?: 0L
                val diaActual = System.currentTimeMillis()

                Log.d("Racha", "ultimoDia: $ultimoDia")
                Log.d("Racha", "diaActual: $diaActual")

                if (ultimoDia == 0L) {
                    guadarUltimoDia()
                    return@collect
                }

                when (isNextDay(ultimoDia, diaActual)) {
                    RACHA.SIGUIENTE_DIA -> {
                        Log.d("Racha", "SIGUIENTE DIA")
                        aumentarRacha()
                    }

                    RACHA.OTRO_DIA -> {
                        Log.d("Racha", "OTRO DIA")
                        romperRacha()
                    }

                    else -> {
                        // Do nothing for MISMO_DIA
                        Log.d("Racha", "MISMO DIA")
                    }
                }
            }
=======
        enableEdgeToEdge()
        setContent {
            IBudgetApp()
>>>>>>> 24766cc (Oficial Commit)
        }

        val navigationItems = listOf(
            NavigationItem(
                title = "Ahorros",
                icon = R.drawable.dinero,
                route = "ahorros"
            ),
            NavigationItem(
                title = "Presupuesto",
                icon = R.drawable.presu,
                route = "presupuesto"
            ),
            NavigationItem(
                title = "Cuenta",
                icon = R.drawable.flecha,
                route = "cuenta"
            ),
            NavigationItem(
                title = "Opciones",
                icon = R.drawable.ajuste,
                route = "opciones"
            )
        )

        enableEdgeToEdge()
        setContent {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 966050e (Agregue dos botones con iconos en la parte superior de la pantalla)
            IbudgetTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
=======
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
>>>>>>> 92def23 ("se agg icons de configuracuin a la pantalla")
=======
            val selectedNavigationIndex = rememberSaveable {
                mutableIntStateOf(0)
            }
            Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
                NavigationBar(
                    windowInsets = NavigationBarDefaults.windowInsets,
                    containerColor = RosaMasClaro,
                ) {
                    navigationItems.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = selectedNavigationIndex.intValue == index,
                            onClick = {
                                selectedNavigationIndex.intValue = index
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(item.icon),
                                    contentDescription = item.title,
                                    modifier = Modifier.size(24.dp)
                                )
                            },
                            label = {
                                Text(
                                    item.title,
                                    color = if (index == selectedNavigationIndex.intValue)
                                        Color.Black
                                    else Color.Gray
                                )
                            },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = RosaClaro,
                                indicatorColor = RosaPrincipal
                            )
>>>>>>> 632e0cc ("se realizo la pantalla de Ahorro  ")

                        )
                    }
                }
            }) { innerPadding ->
                MainScreen(modifier = Modifier.padding(innerPadding))
            }
        }
    }

    fun isNextDay(savedTimestamp: Long, currentTimestamp: Long): RACHA {
        Log.d("Racha", "ultimo dia: $savedTimestamp tiempo actual $currentTimestamp")
        // Convert timestamps to LocalDate
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val savedDate = Instant.ofEpochMilli(savedTimestamp)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()

            val currentDate = Instant.ofEpochMilli(currentTimestamp)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()

            Log.d("Racha", "savedDate $savedDate currentDate $currentDate")

            // Add one day to the saved date
            val nextDayOfSaved = savedDate.plusDays(1)

            if (currentDate.isEqual(nextDayOfSaved)) {
                return RACHA.SIGUIENTE_DIA
            } else if (currentDate.isEqual(savedDate)) {
                return RACHA.MISMO_DIA
            } else {
                return RACHA.OTRO_DIA
            }
        } else {
            return RACHA.OTRO_DIA
        }
    }

    suspend fun guadarUltimoDia() {
        this.dataStore.edit { settings ->
            val currentTimestamp = System.currentTimeMillis()
            settings[ULTIMO_DIA] = currentTimestamp
        }
    }

    suspend fun aumentarRacha() {
        this.dataStore.edit { settings ->
            val currentCounterValue = settings[DIAS_RACHA] ?: 0
            Log.d("Racha", "dias de racha: ${currentCounterValue + 1}")
            settings[DIAS_RACHA] = currentCounterValue + 1
            guadarUltimoDia()
        }
    }

    suspend fun romperRacha() {
        this.dataStore.edit { settings ->
            Log.d("Racha", "Se rompio la racha")
            settings[DIAS_RACHA] = 0
        }
    }
}

<<<<<<< HEAD
data class NavigationItem(
    val title: String,
    val icon: Int,
    val route: String
)
=======
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
                    MainScreen()
                }
                composable(route = "presupuestos") {
                    PresupuestoScreen(onBack = { navController.popBackStack() })
                }
                composable(route = "gastos") {
                    Gastos(budgetViewModel = budgetViewModel, onBack = { navController.popBackStack() })
                }
                composable(route = "cuentas") {
                    AhorrosScreen(onBack = { navController.popBackStack() })
                }
                composable(route = "menu") {
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
>>>>>>> 24766cc (Oficial Commit)
