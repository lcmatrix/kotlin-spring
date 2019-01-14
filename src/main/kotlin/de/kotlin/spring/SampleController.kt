package de.kotlin.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/")
    fun hello(): Greeting {
        return Greeting("Hallo von Kotlin")
    }
}

data class Greeting(val msg: String)
