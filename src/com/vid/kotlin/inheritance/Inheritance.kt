package com.vid.kotlin.inheritance

// Final types cannot be inherited from.
// Need open keyword to make it inheritable
open class Person {

    open fun validate() {

    }

}

// Omit () after person if there are secondary constructors
open class Customer: Person {

    final override fun validate() {

    }

    constructor(): super() {

    }

}

class SpecialCustomer: Customer() {

    // Cannot modify final functions
//    override fun validate() {
//
//    }

}

data class CustomerEntity(val name: String): Person() {

}


fun main() {

    val customer = Customer()
    customer.validate()

}