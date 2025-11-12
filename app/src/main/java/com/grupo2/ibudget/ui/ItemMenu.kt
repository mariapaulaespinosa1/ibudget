package com.grupo2.ibudget.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro

@Composable
fun ItemMenu(imagen: Int, titulo: String){
    ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Image(painter = painterResource(imagen),
                contentDescription = "Casa",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Fit)

            Text(
                text = titulo,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemMenuPreview(){
    IbudgetTheme {
        ItemMenu(imagen = R.drawable.casita, titulo = "Inicio")
    }
}