package com.whatrushka.library_terminal.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PayRequest(
    @SerialName("card_hash") val cardHash: String,
    val reason: String,
    val inn: Int,
    val price: Int,
    @SerialName("category_id") val categoryId: Int
)