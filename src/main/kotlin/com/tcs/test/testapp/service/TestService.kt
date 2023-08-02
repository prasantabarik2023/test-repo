package com.tcs.test.testapp.service

import com.tcs.test.testapp.model.Customer
import com.tcs.test.testapp.repositories.TestRepository
import org.springframework.stereotype.Service

@Service
class TestService(
        private val testRepository: TestRepository
) {

    fun save(customer: Customer){
        testRepository.save(customer)
    }
}