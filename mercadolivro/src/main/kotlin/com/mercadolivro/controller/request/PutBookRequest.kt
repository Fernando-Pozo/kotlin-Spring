package com.mercadolivro.controller.request

import java.math.BigDecimal

data class PutBookRequest (

    var name: String? = null,

    var price: BigDecimal? = null
)
