package com.igorszalas.handyman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HandymanApplication

fun main(args: Array<String>) {
	println("Hello world")
	runApplication<HandymanApplication>(*args)
}
