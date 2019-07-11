package com.vid.kotlin.interop

import com.vid.kotlin.classes.CustomerJava

fun main() {

    val customer = CustomerJava()

    customer.email = "Potato@banana.com"

    customer.prettyPrint()


    val runnable = Runnable { println("Invoking a Runnable") }


    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)
    // ? needed for null safety checks
    customerJava?.id

    // Annotations are a better way to go about it
    // Developer decided when something can be null and something cannot be null
    customerJava?.neverNull()

}

// Inheritence can be done from Java classes without open keyword
class PersonKotlin: PersonJava() {

}


class RunnableKotlin: Runnable {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

// Same for interfaces, notice the ? signifying that return values could be NULL
class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}