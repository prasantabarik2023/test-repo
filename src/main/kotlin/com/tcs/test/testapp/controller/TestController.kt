package com.tcs.test.testapp.controller

import com.tcs.test.testapp.model.Customer
import com.tcs.test.testapp.service.TestService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController(
        private val testService: TestService
) {
    @RequestMapping(value = ["/post"], method = [RequestMethod.POST], produces = ["application/json"], consumes = ["application/json"] )
    fun post(@RequestBody customer: Customer): String{
        testService.save(customer)
        return "Hello ${customer.name}!"
    }
}