@file:OptIn(ExperimentalMaterial3Api::class)

package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.grupo2.ibudget.ui.theme.AppPink
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import java.util.Locale

data class Meta(
    val id: Int,
    val currentAmount: Float,
    val totalAmount: Float,
    val currentDays: Int,
    val totalDays: Int
)

val sampleMetas = listOf(
    Meta(1, 50000f, 5000000f, 5, 120),
    Meta(2, 1000f, 100000f, 9, 365),
    Meta(3, 100000f, 1000000f, 15, 365)
)

@Composable
fun MetasScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Metas", color = Color.Black, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO: Handle add new meta */ },
                containerColor = AppPink,
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Añadir Meta")
            }
        },
        bottomBar = {
            BarraDeNavegacion(selectedDestination = 2) { _, route ->
                navController.navigate(route)
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.White)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 24.dp)
        ) {
            items(sampleMetas) { meta ->
                MetaItem(meta = meta)
            }
        }
    }
}

@Composable
fun MetaItem(meta: Meta) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Add money button
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(AppPink.copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(onClick = { /* TODO: Add to meta */ }) {
                        Icon(
                            Icons.Default.Add,
                            contentDescription = "Añadir dinero a la meta",
                            tint = AppPink,
                            modifier = Modifier.size(40.dp)
                        )
                    }
                }

                // Days progress circle
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(100.dp)
                ) {
                    val dayProgress = if (meta.totalDays > 0) meta.currentDays.toFloat() / meta.totalDays.toFloat() else 0f
                    CircularProgressIndicator(
                        progress = dayProgress,
                        modifier = Modifier.fillMaxSize(),
                        color = AppPink,
                        strokeWidth = 8.dp,
                        trackColor = AppPink.copy(alpha = 0.2f)
                    )
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "${meta.currentDays}/${meta.totalDays}",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 18.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "Días",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Amount progress bar
            val amountProgress = if (meta.totalAmount > 0) meta.currentAmount / meta.totalAmount else 0f
            LinearProgressIndicator(
                progress = amountProgress,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(CircleShape),
                color = AppPink,
                trackColor = AppPink.copy(alpha = 0.2f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Amount text
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = String.format(Locale.US, "$%,.0f / $%,.0f", meta.currentAmount, meta.totalAmount),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MetasScreenPreview() {
    IbudgetTheme {
        MetasScreen(rememberNavController())
    }
}
