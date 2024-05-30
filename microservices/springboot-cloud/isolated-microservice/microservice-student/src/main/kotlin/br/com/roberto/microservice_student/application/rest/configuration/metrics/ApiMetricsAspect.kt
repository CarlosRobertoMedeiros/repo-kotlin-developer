//package br.com.roberto.servicestudent.application.rest.configuration.metrics
//
//import io.micrometer.core.instrument.MeterRegistry
//import org.aspectj.lang.JoinPoint
//import org.aspectj.lang.annotation.AfterReturning
//import org.aspectj.lang.annotation.Aspect
//import org.aspectj.lang.annotation.Pointcut
//import org.springframework.stereotype.Component
//
//@Aspect
//@Component
//class ApiMetricsAspect(private val meterRegistry: MeterRegistry) {
//
//    @Pointcut("execution(public * br.com.roberto.servicestudent.application.controller.*Controller.*(..))")
//    fun apiControllerMethods() {}
//
//    @AfterReturning(pointcut = "apiControllerMethods()", returning = "returnValue")
//    fun recordApiMetrics(joinPoint: JoinPoint, returnValue: Any?) {
//        val className = joinPoint.signature.declaringType.simpleName
//        val methodName = joinPoint.signature.name
//
//        meterRegistry.counter("api.requests.total", "class", className, "method", methodName).increment()
////        meterRegistry.timer("api.requests.timer", "class", className, "method", methodName).record {
////            // optional: record the duration of the API call
////        }
//    }
//}