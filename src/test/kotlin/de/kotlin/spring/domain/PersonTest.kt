package de.kotlin.spring.domain

import kotlin.test.Test
import kotlin.test.assertEquals


class PersonTest {
    @Test
    fun `Person toString`() {
        val p: Person = Person(null, "Some", "People")
        assertEquals("Person [firstname: Some, lastname: People]", p.toString(), "should be equal")
    }
}