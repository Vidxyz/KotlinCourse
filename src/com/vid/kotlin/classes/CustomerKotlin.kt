package com.vid.kotlin.classes

// Data is like case in Scala - adds equals/hashcode/copy and toString methods
// All these method can still be overridden
data class CustomerKotlin(var id: Int, var name: String, var email: String)


fun main() {

    val customer1 = CustomerKotlin(1, "Vid", "vid@email.com")
    val customer2 = CustomerKotlin(1, "Vid", "vid@email.com")

    val customer3 = customer1

    println(customer1)
    println(customer3)

    val customer4 = customer1.copy()
    println(customer4)

    val customer5 = customer1.copy(name="Vidhyasagar")
    println(customer5)

    if(customer1 == customer2) println("They are the same")

}