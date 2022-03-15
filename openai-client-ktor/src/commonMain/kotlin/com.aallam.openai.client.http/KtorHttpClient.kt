package com.aallam.openai.client.http

import com.aallam.openai.client.http.internal.toKtorHttpMethod
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.request
import io.ktor.client.request.url
import io.ktor.client.HttpClient as KtorClient

public class KtorHttpClient(public val httpClient: KtorClient) : HttpClient {

    override suspend fun performRequest(request: HttpRequest): HttpResponse {
        return try {
            val requestBuilder = HttpRequestBuilder().apply {
                method = request.method.toKtorHttpMethod()
                url(request.url)

            }
            val response = httpClient.request(requestBuilder)
            TODO()
        } catch (e: Exception) {
            TODO()
        }
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}
