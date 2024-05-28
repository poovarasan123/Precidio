package com.tt.mymodule.data.repository

import com.tt.mymodule.data.model.ProductResponseItem
import com.tt.mymodule.di.ApiService
import javax.inject.Inject

interface ProductRepository {
    suspend fun getProducts(): List<ProductResponseItem>
}

class RetrofitProductRepository @Inject constructor(private val apiService: ApiService) : ProductRepository {

    override suspend fun getProducts(): List<ProductResponseItem> {
        return apiService.getProducts()
    }
}