package com.aallam.openai.client.http.internal

import com.aallam.openai.client.http.HttpMethod
import io.ktor.http.HttpMethod as KtorHttpMethod

internal fun HttpMethod.toKtorHttpMethod(): KtorHttpMethod {
    return when (this) {
        HttpMethod.Get -> KtorHttpMethod.Get
        HttpMethod.Post -> KtorHttpMethod.Post
        HttpMethod.Put -> KtorHttpMethod.Put
        HttpMethod.Delete -> KtorHttpMethod.Delete
    }
}
