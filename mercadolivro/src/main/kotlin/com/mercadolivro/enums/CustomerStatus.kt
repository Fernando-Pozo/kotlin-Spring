package com.mercadolivro.enums

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat
enum class CustomerStatus {
    ATIVO,
    INATIVO
}
