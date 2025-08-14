package com.grupo2.ibudget

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.lifecycleScope
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.ZoneId

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

enum class RACHA {
    SIGUIENTE_DIA, MISMO_DIA, OTRO_DIA
}

class MainActivity : ComponentActivity() {

    val DIAS_RACHA = intPreferencesKey("dias_racha")
    val ULTIMO_DIA = longPreferencesKey("ultimo_dia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.dataStore.data.map { preferences ->
            val ultimoDia = preferences[ULTIMO_DIA] ?: 0L
            val diaActual = System.currentTimeMillis()

            if (ultimoDia == 0L) {
                lifecycleScope.launch {
                    guadarUltimoDia()
                }
            }

            when (isNextDay(ultimoDia, diaActual)) {
                RACHA.SIGUIENTE_DIA -> {
                    lifecycleScope.launch {
                        aumentarRacha()
                    }
                }

                RACHA.OTRO_DIA -> {
                    lifecycleScope.launch {
                        romperRacha()
                    }
                }

                else -> {

                }
            }
        }

        enableEdgeToEdge()
        setContent {
            IbudgetTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }

    fun isNextDay(savedTimestamp: Long, currentTimestamp: Long): RACHA {
        // Convert timestamps to LocalDate
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val savedDate = Instant.ofEpochMilli(savedTimestamp)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
            val currentDate = Instant.ofEpochMilli(currentTimestamp)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()

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
