//package br.com.roberto.servicestudent.application.rest.configuration.metrics
//
//import io.micrometer.core.instrument.MeterRegistry
//import io.micrometer.prometheus.PrometheusConfig
//import io.micrometer.prometheus.PrometheusMeterRegistry
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class MetricsConfiguration {
//    @Bean
//    fun meterRegistry(): MeterRegistry {
//        return PrometheusMeterRegistry(PrometheusConfig.DEFAULT)
//    }
//}