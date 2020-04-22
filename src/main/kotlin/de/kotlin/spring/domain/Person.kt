package de.kotlin.spring.domain

import org.springframework.data.mongodb.repository.MongoRepository

class Person(
    var id: String?,
    var firstname: String,
    var lastname: String) {

        fun changeName(firstname: String, lastname: String) {
            this.firstname = firstname
            this.lastname = lastname
        }

        fun fullname(): String {
            return "${firstname} ${lastname}"
        }

        override fun toString(): String {
            return "Person [firstname: ${firstname}, lastname: ${lastname}]"
        }
    }

interface PersonRepository: MongoRepository<Person, String> {
    fun findByLastname(lastname: String): Person?
}