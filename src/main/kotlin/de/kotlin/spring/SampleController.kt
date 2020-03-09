package de.kotlin.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RestController
@RequestMapping("/greeting")
class SampleController {
    private val LOG: Logger = LoggerFactory.getLogger(SampleController::class.java)
    private var greets = Greeting("Default")

    @GetMapping
    fun hello(): Greeting {
        LOG.debug("Response: {}", greets)
        return greets
    }

    @PostMapping
    fun save(@RequestBody greeting: Greeting) {
        LOG.debug("Got request body: {}", greeting)
        greets = greeting
    }
}

data class Greeting(val msg: String) {
    fun sayHello() : String {
        return "Hello!"
    }
}
