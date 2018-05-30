package io.spring.workshop.tradingservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TradingServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(TradingServiceApplication::class.java, *args)
}
