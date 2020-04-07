package de.kotlin.spring

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import de.kotlin.spring.domain.Person
import de.kotlin.spring.domain.PersonRepository

@RestController
class SampleController(private val personRepository: PersonRepository) {
    private val LOG: Logger = LoggerFactory.getLogger(SampleController::class.java)
    private var greets = Greeting("Default")

    @GetMapping("/greeting")
    fun hello(): Greeting {
        LOG.debug("Response: {}", greets)
        return greets
    }

    @PostMapping("/greeting")
    fun save(@RequestBody greeting: Greeting) {
        LOG.debug("Got request body: {}", greeting)
        greets = greeting
    }

    @GetMapping("/person/{lastname}")
    fun getPerson(@PathVariable lastname: String): Person? {
        LOG.debug("searching for {}", lastname)
        return personRepository.findByLastname(lastname)
    }

    @PostMapping("/person")
    fun postPerson(@RequestBody person: Person) {
        LOG.debug("inserting {}", person)
        personRepository.insert(person)
    }
}

data class Greeting(val msg: String) {
    fun sayHello() : String {
        return "Hello!"
    }
}
