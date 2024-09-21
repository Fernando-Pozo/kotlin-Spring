package com.mercadolivro.model

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.enums.Errors
import jakarta.persistence.*
import org.apache.coyote.BadRequestException
import org.springframework.web.client.HttpClientErrorException.BadRequest
import java.math.BigDecimal

@Entity(name = "book")
data class BookModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var price: BigDecimal,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: CustomerModel? = null,
){
    @Column
    @Enumerated(EnumType.STRING)
    var status: BookStatus? = null
        set(value){
            if (field == BookStatus.CANCELADO || field == BookStatus.DELETADO) {
                throw com.mercadolivro.controller.exception.BadRequestException(
                    Errors.ML102.message.format(field),
                    Errors.ML102.code
                )
            }
            field = value
        }

    constructor(id: Int? = null,
                name: String,
                price: BigDecimal,
                customer: CustomerModel? = null,
                status: BookStatus?): this(id, name, price, customer){
                    this.status = status
                }
}