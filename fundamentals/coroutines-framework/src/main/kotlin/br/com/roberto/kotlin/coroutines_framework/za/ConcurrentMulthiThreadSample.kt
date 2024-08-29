package br.com.roberto.kotlin.coroutines_framework.za

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Sample Using the Concurrent function with thread using coroutines
 * Was divided the 1_000_000 numbers in 4 parts(250_000) Lists and each part executed the square-value
 * and in the end happened the sum of values.
 *
 *
 *
 * */
fun main() = runBlocking {

    val numbers = (1..1_000_000).toList()

    val time = measureTimeMillis {
        val result = calculateSquaresConcurrently(numbers)
        println("Sum os squares: $result")
    }
    println("Time Taken: $time ms")
}

suspend fun calculateSquaresConcurrently(numbers: List<Int>):Int {
    return coroutineScope {
        val deferredResult = numbers.chunked(250_000).map { chunk ->
            async {
                chunk.sumOf { it * it }
            }
        }
        deferredResult.sumOf { it.await() }
    }
}