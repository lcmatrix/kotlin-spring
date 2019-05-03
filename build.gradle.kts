buildscript {
    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.3.RELEASE")
    }
}

repositories {
    jcenter()
}

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM
    kotlin("jvm") version("1.3.21")
    id("org.jetbrains.kotlin.plugin.spring").version("1.3.21")

    id("org.springframework.boot").version("2.1.3.RELEASE")
    id("io.spring.dependency-management").version("1.0.6.RELEASE")
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use the Kotlin JDK 8 standard library
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework.boot:spring-boot-starter-web")

    // Use the Kotlin test library
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.bootJar {
    mainClassName  = "de.kotlin.spring.App"
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}