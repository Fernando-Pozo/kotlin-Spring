package com.mercadolivro.service

import com.fasterxml.jackson.databind.util.ExceptionUtil
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository,
    repository: CustomerRepository
)  {


    fun getAll(name: String?): List<CustomerModel>{
        name?.let {
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel){
       customerRepository.save(customer)
    }

    fun getByID(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun update(customer: CustomerModel) {
        if (!customerRepository.existsById(customer.id!!)){
            throw Exception()
        }
        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        if (!customerRepository.existsById(id)){
            throw Exception()
        }
        customerRepository.deleteById(id)
    }
}