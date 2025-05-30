package com.grupo2.ibudget.ui.theme

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ContentItem() {
    var modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    Text("Buscar contenido")

    modifier = Modifier.fillMaxWidth()
    Spacer(modifier = Modifier.height(16.dp))
    Text("No se encontraron resultados")

    Column {
        modifier = Modifier.padding(8.dp)
        "Image,video,article etc"

        val allcontent = listOf(
            "como ahorrar en casa," +
                    "inversion basica,"
        )
        "Exportar reportes finacieros"
        "Tutorial de presupuesto"
        "Infografia de finanzas"
        "Grafico de ingresos"
        "Video introduccion a ibudget"

        val suggestions = listOf(
            "ahorrar,inversion," +
                    "exportar,presupuesto," +
                    "finanzas,ingresos,ibudget"
        )

    }
}
