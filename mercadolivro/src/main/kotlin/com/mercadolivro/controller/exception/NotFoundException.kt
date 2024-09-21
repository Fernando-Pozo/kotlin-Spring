package com.mercadolivro.controller.exception

class NotFoundException(override val message: String, val errorCode: String) : Exception() {
}