package com.vid.kotlin.functions

// Examples of Extension functions on already existing classes
// Extension can be done without inheritance from the class in question
fun String.hello() {
    println("It's me, Mario!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {it.capitalize()}
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") {"$prefix, ${it.capitalize()}"}
}

fun main() {
    val string = "Another one"
    string.hello()
    "Hello".hello()
    println("THIS IS A SAMPLE STRING TO TITLE CASE IT".toTitleCase())
    println("this is a sample string to title case it".toTitleCase())
    println("this is a sample string to title case it".toTitleCase("Again -"))



    val customer = Customer()
    customer.makePreferred()
    customer.makePreferred("test")



    val instannce: BaseClass = InheritedClass()
    // This will run the base class extension method
    instannce.extension()

    val instannce2: InheritedClass = InheritedClass()
    // This will run the inherited class extension method
    instannce2.extension()
}


// Member function takes preference over extension function
// However, overloading differentiates them
// Extension functions are STATICALLY RESOLVED
class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(msg: String) {
    println("Extended version")
}


open class BaseClass

class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}
