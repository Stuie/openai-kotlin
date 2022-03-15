package com.aallam.openai.client.http

public interface HttpClient {

    /**
     * Perform http request and return a response.
     *
     * @param request the [HttpRequest] to send
     */
    public suspend fun performRequest(request: HttpRequest): HttpResponse

    /** Closes the underlying resources. */
    public fun close()
}
