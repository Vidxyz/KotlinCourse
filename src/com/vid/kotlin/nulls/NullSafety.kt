package com.vid.kotlin.nulls

import com.vid.kotlin.classes.CustomerJava


class Service {
    fun evaluate() {}
}

class ServiceProvider {
    fun createServices(): Service? {
        return null
    }
}

fun main() {

    val message: String = "A message"
    println(message.length)

    // ? means the var can now hold a null value
    val nullMessage: String? = null
    val inferredNull = null

    if(nullMessage != null) {
        println(nullMessage.length)
    }

    // This is cumbersome
    val customerJava = CustomerJava()
    if(customerJava != null) {
        if(customerJava.name != null) {
            println(customerJava.name.length)
        }
    }

    // -----
    // Better way to do it is like this
    // -----
    println(nullMessage?.length)

    // Asking compiler to suppress NPE warnings and let us do our own thing
    println(nullMessage!!.length)

    val sp = createServiceProvider()
    sp?.createServices()?.evaluate()

}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()