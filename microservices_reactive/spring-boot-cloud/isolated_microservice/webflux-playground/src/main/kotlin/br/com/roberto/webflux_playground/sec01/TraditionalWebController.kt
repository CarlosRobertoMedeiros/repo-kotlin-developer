package br.com.roberto.webflux_playground.sec01

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.client.JdkClientHttpRequestFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient
import reactor.core.publisher.Flux


@RestController
@RequestMapping("traditional")
class TraditionalWebController {
    private val log: Logger = LoggerFactory.getLogger(TraditionalWebController::class.java)

    private val restClient = RestClient.builder()
        .requestFactory(JdkClientHttpRequestFactory())
        .baseUrl("http://localhost:8085")
        .build()

    @GetMapping("products")
    fun getProducts(): List<Product> {
        val products = restClient.get()
            .uri("/demo01/products")
            .retrieve()
            .body(object : ParameterizedTypeReference<List<Product>>() {})

        log.info("received response: {}", products)
        return products ?: emptyList()
    }

    @GetMapping("products2")
    fun getProducts2(): Flux<Product> {
        val products = restClient.get()
            .uri("/demo01/products")
            .retrieve()
            .body(object : ParameterizedTypeReference<List<Product>>() {})

        log.info("received response: {}", products)
        return Flux.fromIterable(products ?: emptyList())
    }


}