package com.example.cidemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class CidemoApplication {

    @GetMapping("/hello")
    fun sayHello(@RequestParam(required = false) name: String?): String {
        val username = name ?: "stranger"
        return "Hello there $username"
    }
}

fun main(args: Array<String>) {
    runApplication<CidemoApplication>(*args)
}
