package com.aallam.openai.client.http

public enum class HttpMethod(public val method: String) {
    Get("GET"),
    Post("POST"),
    Put("PUT"),
    Delete("DELETE");
}
