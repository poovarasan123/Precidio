package com.tt.mymodule.data.model


import com.google.gson.annotations.SerializedName



data class ProductResponseItem(
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("title")
    val title: String
)

data class Rating(
    @SerializedName("count")
    val count: Int,
    @SerializedName("rate")
    val rate: Double
)