package io.spring.workshop.tradingservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopController {
    @GetMapping
    fun top() = "Hello Kotlin!"
}
