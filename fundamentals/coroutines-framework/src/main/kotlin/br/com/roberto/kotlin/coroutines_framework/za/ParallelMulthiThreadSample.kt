package br.com.roberto.kotlin.coroutines_framework.za

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 * Sample Using the Parallel function with Dispatcher and thread using coroutines
 * Was divided the 1_000_000 numbers in in 8 parts(125_000) Lists and each part executed the squarevalue
 * and in the end happened the sum of values.
 *
 *
 *
 * */
fun main() = runBlocking {

    val numbers = (1..1_000_000).toList()

    val time = measureTimeMillis {
        val result = calculateSquaresInParallel(numbers)
        println("Sum os squares: $result")
    }
    println("Time Taken: $time ms")
}

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun calculateSquaresInParallel(numbers: List<Int>):Int {
    return coroutineScope {
        val deferredResult = numbers.chunked(125_000).map { chunk ->
            async(Dispatchers.IO.limitedParallelism(8)){
                chunk.sumOf { it * it }
            }
        }
        deferredResult.sumOf { it.await() }
    }
}