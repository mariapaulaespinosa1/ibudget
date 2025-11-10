package com.grupo2.ibudget

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BudgetViewModel : ViewModel() {
    private var _listaGastos = MutableStateFlow<List<String>>(emptyList())
    val listaGastos: StateFlow<List<String>> = _listaGastos

    fun anadirGasto(gasto: String) {
        val tempList = listaGastos.value.toMutableList()
        tempList.add(gasto)
        _listaGastos.value = tempList
    }
}
