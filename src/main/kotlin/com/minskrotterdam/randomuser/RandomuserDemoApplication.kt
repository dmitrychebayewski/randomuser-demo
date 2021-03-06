package com.minskrotterdam.randomuser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
@Configuration
class RandomuserDemoApplication

fun main(args: Array<String>) {
    runApplication<RandomuserDemoApplication>(*args)
}