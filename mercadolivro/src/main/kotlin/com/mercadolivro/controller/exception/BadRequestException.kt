package com.mercadolivro.controller.exception

class BadRequestException(override val message: String, val errorCode: String) : Exception() {
}