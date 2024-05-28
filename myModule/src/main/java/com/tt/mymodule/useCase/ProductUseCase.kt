package com.tt.mymodule.useCase

import com.tt.mymodule.data.model.ProductResponseItem
import com.tt.mymodule.data.repository.ProductRepository

class ProductUseCase(private val productRepository: ProductRepository) {

    suspend fun getProducts(): List<ProductResponseItem> {
        return productRepository.getProducts()
    }
}