package com.mercadolivro.controller.mapper

import com.mercadolivro.controller.request.PostPurchaseRequest
import com.mercadolivro.model.PurchaseModel
import com.mercadolivro.service.BookService
import com.mercadolivro.service.CustomerService
import org.springframework.stereotype.Component

@Component
class PurcgaseMapper(
    private val bookService: BookService,
    private val customerService: CustomerService
){
    fun toModel(request: PostPurchaseRequest): PurchaseModel {
       val customer = customerService.getByID(request.customerId)
       val books = bookService.findAllByIds(request.bookIds)

        return PurchaseModel(
            customer = customer,
            books = books.toMutableList(),
            price = books.sumOf { it.price }
        )
    }
}