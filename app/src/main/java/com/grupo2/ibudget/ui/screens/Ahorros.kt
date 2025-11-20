package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro

@Composable
fun AhorrosScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(RosaClaro)
    ) {
        Text(text = "Ahorros")
    }
}

@Preview(showBackground = true)
@Composable
fun AhorrosScreenPreview() {
    IbudgetTheme {
        AhorrosScreen()
    }
}
