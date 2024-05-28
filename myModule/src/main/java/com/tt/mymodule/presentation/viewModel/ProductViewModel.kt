package com.tt.mymodule.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tt.mymodule.data.model.ProductResponseItem
import com.tt.mymodule.data.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {

    private val _products = MutableStateFlow<List<ProductResponseItem>>(emptyList())
    val products: StateFlow<List<ProductResponseItem>> get() = _products

    init {
        viewModelScope.launch {
            _products.value = repository.getProducts()
        }
    }
}