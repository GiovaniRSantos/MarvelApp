package com.example.core.domain.model

import com.google.gson.annotations.SerializedName

data class Character(

    @SerializedName("name")
    val name: String,

    @SerializedName("imageUrl")
    val imageUrl: String
)
