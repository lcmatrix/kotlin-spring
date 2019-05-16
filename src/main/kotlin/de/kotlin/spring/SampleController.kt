package de.kotlin.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RestController
class SampleController {
    private val LOG: Logger = LoggerFactory.getLogger(SampleController::class.java)

    @GetMapping("/")
    fun hello(): Greeting {
        LOG.debug("call to greeting")
        return Greeting("Hallo von Kotlin")
    }
}

data class Greeting(val msg: String)
