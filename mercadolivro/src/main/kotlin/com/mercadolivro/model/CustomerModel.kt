package com.mercadolivro.model

import com.mercadolivro.enums.CustomerStatus
import jakarta.persistence.*

@Entity(name = "CUSTOMER")
data class CustomerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "name")
    var name: String,

    @Column
    var email: String,

    @Column
    @Enumerated(EnumType.STRING)
    var status: CustomerStatus
)