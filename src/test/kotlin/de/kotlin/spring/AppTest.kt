package de.kotlin.spring

import kotlin.test.Test
import org.springframework.boot.test.context.SpringBootTest
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@SpringBootTest
class AppTest {
    private val log: Logger = LoggerFactory.getLogger(AppTest::class.java)

    @Test
    fun contextLoaded() {
        log.info("Context loaded")
    }
}
