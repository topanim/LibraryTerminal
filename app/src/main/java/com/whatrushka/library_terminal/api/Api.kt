package com.whatrushka.library_terminal.api

import com.whatrushka.library_terminal.api.models.PayRequest
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class Api(
    private val client: HttpClient
) {
    companion object {
        const val DOMAIN = "http://45.155.207.232:1290"
        const val PAY = "$DOMAIN/api/user/cash/minus"
    }

    suspend fun pay(cardHash: String, reason: String, inn: Int, amount: Int, categoryId: Int) = client
        .post(PAY) {
            contentType(ContentType.Application.Json)
            setBody(
                PayRequest(
                    cardHash = cardHash,
                    reason = reason,
                    inn = inn,
                    price = amount,
                    categoryId = categoryId
                )
            )
        }
}