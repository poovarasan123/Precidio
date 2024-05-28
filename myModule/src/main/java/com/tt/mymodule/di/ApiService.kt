package com.tt.mymodule.di

import com.tt.mymodule.data.model.ProductResponseItem
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<ProductResponseItem>
}