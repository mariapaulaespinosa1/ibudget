package com.grupo2.ibudget

import androidx.lifecycle.ViewModel
import com.grupo2.ibudget.ui.screens.Gasto
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BudgetViewModel : ViewModel() {
    private var _listaGastos = MutableStateFlow<List<Gasto>>(emptyList())
    val listaGastos: StateFlow<List<Gasto>> = _listaGastos

    fun anadirGasto(gasto: Gasto) {
        val tempList = listaGastos.value.toMutableList()
        tempList.add(gasto)
        _listaGastos.value = tempList
    }
}
