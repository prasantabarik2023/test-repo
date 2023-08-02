package com.tcs.test.testapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestAppApplication

fun main(args: Array<String>) {
	runApplication<TestAppApplication>(*args)
}
