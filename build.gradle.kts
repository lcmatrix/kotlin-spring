buildscript {
    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.2.5.RELEASE")
    }
}

repositories {
    jcenter()
}

plugins {
    java
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM
    kotlin("jvm") version("1.3.72")
    id("org.jetbrains.kotlin.plugin.spring").version("1.3.72")
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.72"
    id("org.springframework.boot").version("2.2.5.RELEASE")
    id("io.spring.dependency-management").version("1.0.9.RELEASE")
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
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    // implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.mongodb:mongo-java-driver:3.12+")

    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // Use the Kotlin test library
    testImplementation(kotlin("test"))

    // Use the Kotlin JUnit integration
    testImplementation(kotlin("test-junit"))
}

group = "lcmatrix"
version = "0.1.0"

springBoot {
    mainClassName = "de.kotlin.spring.AppKt"
    buildInfo()
}

tasks.bootRun {
    sourceResources(sourceSets["main"])
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

tasks.wrapper {
    gradleVersion = "6.3"
}
