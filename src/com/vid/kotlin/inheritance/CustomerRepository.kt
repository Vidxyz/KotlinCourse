package com.vid.kotlin.inheritance

// Cannot hold 'STATE': Similar to Traits in Scala
// This is one KEY difference between interfaces and abstract classes
interface CustomerRepository {

    val isEmpty: Boolean
        get() = true


    // Interfaces in Kotlin CAN have implementation. Default implementations
    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer

}


interface EmployeeRepository {
    fun store(obj: Employee) {

    }

    fun getById(id: Int): Employee
}

class SQLCustomerRepository: CustomerRepository {

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        // Insert custom implementation here
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}


interface Interface1 {
    fun funA() {
        println("Fun A from interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from interface 2")
    }
}

// Multiple interfaces can have same method names
class Class1And2: Interface1, Interface2 {
    override fun funA() {
        println("Our own")
        super<Interface1>.funA()
        super<Interface2>.funA()
    }
}


fun main() {
    val c = Class1And2()
    c.funA()
}

