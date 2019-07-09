package com.vid.kotlin.functions

import java.lang.Exception

fun hello(): Unit {
    println("Hello World")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

// Return type is optional
fun returnsAFour(): Int {
    return 4
}

// Single expression funtion
fun sum(x: Int, y: Int) = x + y


fun sum2(x: Int = 0, y: Int = 0, z: Int = 0) = x+y+z

fun printDetails(name: String, email: String = "", phone: String)  {
    println("Name: $name - Email: $email, Phone: $phone")
}


// * is the spread operator. Used to pass in varargs of strings

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)
}

fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}


fun main() {
    hello()

    val valute = returnsAFour()

    val v = sum2(1,2)

    printDetails("Vid", phone="555 123")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")


}


