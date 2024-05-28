package com.tt.mymodule.di

import com.tt.mymodule.data.repository.ProductRepository
import com.tt.mymodule.data.repository.RetrofitProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UiComponentModule {

    @Provides
    @Singleton
    fun provideProductRepository(apiService: ApiService): ProductRepository {
        return RetrofitProductRepository(apiService)
    }
}
