package com.mercadolivro.controller.exception

class AuthenticationException(override val message: String, val errorCode: String) : Exception()