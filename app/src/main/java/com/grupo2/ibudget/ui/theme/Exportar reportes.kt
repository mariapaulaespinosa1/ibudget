package com.grupo2.ibudget.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.unit.dp

@Composable
fun usuario() {

    var modifier =

      Modifier.fillMaxSize()
        .padding(16.dp)

          "Exportar reportes financieros"

    modifier =

        modifier.padding(bottom = 8.dp)

    // aqui se puede implementar la logica de la exportacion (PDF,CSV,)

    modifier =

        Modifier.padding(16.dp)

    modifier=

        Modifier.width(8.dp)
    

    Text("Exportar reportes")

}




















