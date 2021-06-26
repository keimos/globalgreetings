package com.keimos.globalgreetings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GlobalgreetingsApplication

fun main(args: Array<String>) {
	runApplication<GlobalgreetingsApplication>(*args)
}
