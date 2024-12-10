package br.com.roberto.aluragames.servicos

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class ConsumoApi {

    fun buscaJogo(id : String) :String {

        val endereco = "https://www.cheapshark.com/api/1.0/games?id=${id}"

        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build()

        val response = client
            .send(request, BodyHandlers.ofString())

       return response.body()
    }

}