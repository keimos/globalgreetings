package com.keimos.globalgreetings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GlobalgreetingsApplication

fun main(args: Array<String>) {
	runApplication<GlobalgreetingsApplication>(*args)
}

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("2", "Hola!"),
		Message("3", "Bonjour!"),
		Message("4", "Privet!"),
	)
}


data class Message (val id: String?, val text: String)