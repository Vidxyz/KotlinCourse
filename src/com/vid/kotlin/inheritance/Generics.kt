package com.vid.kotlin.inheritance

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}


fun main() {
    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(1)
    val customers = customerRepo.getAll()
}