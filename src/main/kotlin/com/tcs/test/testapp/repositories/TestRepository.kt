package com.tcs.test.testapp.repositories

import com.tcs.test.testapp.model.Customer
import org.springframework.data.mongodb.repository.MongoRepository

interface TestRepository : MongoRepository<Customer, String> {
}