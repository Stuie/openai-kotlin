package com.aallam.openai.client.http

public interface HttpResponse {
    public val httpStatusCode: Int

    public class Success(override val httpStatusCode: Int, public val body: Sequence<Byte>) : HttpResponse
    public class Error(override val httpStatusCode: Int, public val error: String) : HttpResponse
}
