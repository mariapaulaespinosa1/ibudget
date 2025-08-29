package com.grupo2.ibudget.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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

              "image,video,articulo,etc."

            val allcontent = listOf(

                        "como ahorrar en casa,"+
                        "inversion basica"
            )

                     "tutorial del presupuesto"+
                    "infografia de las finanzas" +
                     "grafico de ingresos" +
                     "video de introduction en ibudget"


            val suggestions = listOf(
                       "ahorrar,inversion,"+
                        "exportar,presupuestos"+
                        "ingresos,o finanzas,con ibudget"
            )
        }
    }















