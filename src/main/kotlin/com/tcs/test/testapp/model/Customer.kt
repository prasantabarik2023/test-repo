package com.tcs.test.testapp.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
data class Customer(
        @Id
        val id: String,
        val name: String,
)
