package de.kotlin.spring.domain

import org.springframework.data.mongodb.repository.MongoRepository

class Person(
    var id: String?,
    var firstname: String,
    var lastname: String)

interface PersonRepository: MongoRepository<Person, String> {
    fun findByLastname(lastname: String): Person?
}