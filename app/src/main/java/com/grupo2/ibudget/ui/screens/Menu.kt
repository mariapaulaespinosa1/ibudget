package com.grupo2.ibudget.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro
import com.grupo2.ibudget.ui.theme.RosaPrincipal

private data class MenuItem(val imageRes: Int, val title: String, val contentDescription: String, val onClick: () -> Unit)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(onBack: () -> Unit) {
    val menuItems = listOf(
        MenuItem(R.drawable.casita, stringResource(R.string.menu_home), stringResource(R.string.menu_home)) { /* TODO: Handle click */ },
        MenuItem(R.drawable.usuario, stringResource(R.string.menu_change_account), stringResource(R.string.menu_change_account)) { /* TODO: Handle click */ },
        MenuItem(R.drawable.ajuste, stringResource(R.string.menu_logout), stringResource(R.string.menu_logout)) { /* TODO: Handle click */ }
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.menu_title), color = Color.White, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = stringResource(id = R.string.back_button_description),
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = RosaPrincipal)
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(RosaClaro)
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(menuItems) { item ->
                ItemMenu(
                    painter = painterResource(id = item.imageRes),
                    title = item.title,
                    contentDescription = item.contentDescription,
                    onClick = item.onClick
                )
            }
        }
    }
}

@Composable
private fun ItemMenu(painter: Painter, title: String, contentDescription: String, onClick: () -> Unit) {
    ElevatedCard(
        modifier = Modifier.clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = title,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    IbudgetTheme {
        MenuScreen(onBack = {})
    }
}
