package br.com.roberto.microservice_student.commons.metrics

import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Timer
import org.springframework.stereotype.Component
import java.time.Duration

@Component
class AppMetrics(private val meterRegistry: MeterRegistry) {
    fun <T> incrementalInternal(operation:String, block: () ->T): T {
        val timer: Timer = meterRegistry.timer(operation)
        val startTime = System.nanoTime()

        try {
            val result: T = block()
            val durationInNanos = System.nanoTime() - startTime
            val duration = Duration.ofNanos(durationInNanos)
            timer.record(duration)
            return result
        } catch (e: Exception) {
            val durationInNanosError = System.nanoTime() - startTime
            val durationError = Duration.ofNanos(durationInNanosError)
            timer.record(durationError)
            throw e
        }

    }

    fun <T> incrementalExternal(resource:String, operation:String, block: () ->T): T{
        val timer: Timer = meterRegistry.timer(resource,operation)
        val startTime = System.nanoTime()

        try {
            val result: T = block()
            val durationInNanos = System.nanoTime() - startTime
            val duration = Duration.ofNanos(durationInNanos)
            timer.record(duration)
            return result
        } catch (e: Exception) {
            val durationInNanosError = System.nanoTime() - startTime
            val durationError = Duration.ofNanos(durationInNanosError)
            timer.record(durationError)
            throw e
        }
    }

//    fun <T> incrementalDatabase(kclass:String, operation:String, block: () ->T): T{
//        val timer: Timer = meterRegistry.timer(kclass,operation)
//        val startTime = System.nanoTime()
//
//        try {
//            val result: T = block()
//            val durationInNanos = System.nanoTime() - startTime
//            val duration = Duration.ofNanos(durationInNanos)
//            timer.record(duration)
//            return result
//        } catch (e: Exception) {
//            val durationInNanosError = System.nanoTime() - startTime
//            val durationError = Duration.ofNanos(durationInNanosError)
//            timer.record(durationError)
//            throw e
//        }
//    }



}