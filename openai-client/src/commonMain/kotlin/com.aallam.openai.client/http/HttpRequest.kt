package com.aallam.openai.client.http

public class HttpRequest(
    public val method: HttpMethod,
    public val url: String,
    public val headers: Map<String, String>? = null,
    public val body: Sequence<Byte>? = null,
)
