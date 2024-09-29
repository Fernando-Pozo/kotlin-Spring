package com.mercadolivro.controller.request

import com.mercadolivro.validation.EmailAvailable
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser preenchido")
    var name: String,

    @field:Email(message = "E-mail deve ser valido")
    @EmailAvailable
    var email: String,

    var status: String?,

    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String
)