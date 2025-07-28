package br.com.roberto.webflux_playground.sec01

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux


@RestController
@RequestMapping("reactive")
class ReactiveWebController {
    private val log: Logger = LoggerFactory.getLogger(ReactiveWebController::class.java)

    private val webClient: WebClient = WebClient.builder()
        .baseUrl("http://localhost:8085")
        .build()


    @GetMapping("products")
    fun getProducts(): Flux<Product> {
        return webClient.get()
            .uri("/demo01/products")
            .retrieve()
            .bodyToFlux(Product::class.java)
            .doOnNext { p: Product? -> log.info("received: $p") }
    }

    @GetMapping(value = ["products/stream"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getProductsStream(): Flux<Product> {
        return webClient.get()
            .uri("/demo01/products")
            .retrieve()
            .bodyToFlux(Product::class.java)
            .doOnNext { p: Product? -> log.info("received: $p") }
    }


}