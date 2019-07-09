package com.vid.kotlin.classes

import java.lang.IllegalArgumentException
import java.util.*

class Customer(val id: Int, var name: String, val yearOfBirth: Int)  {
    // No concept of fields, only PROPERTIES

    val age: Int
        // Multi line get() needs curly braces
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
        set(value) {
            if(!value.startsWith("SN")) {
                throw IllegalArgumentException("SSN should start with SN")
            }
            // SPECIAL KEYWORD - referring to backing field
            field = value
        }

    // Executed when instance of class is created
    init {
        name = name.toUpperCase()
    }

    // Secondary constructor
    constructor(email: String): this(0, "", 1995) {
        // Additional lines of code to execute go here
    }


}


fun main() {

    val customer = Customer(10, "Vidhyasagar", 1995)
    // Vars can be changed
//    customer.id = 11
    customer.ssn = "SN234578"
    println(customer.name)
    println(customer.age)
    println(customer.ssn)

//    val c2 = Customer(11)

}