package com.zeek1910.laboratoryworkexamples

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    val id: Int,
    val name: String,
    val status: String,
    val gender: String,
    @SerializedName("image")
    val imageUrl: String
)
