package com.vid.kotlin.basics

import com.vid.kotlin.basics.Utils.someUtility as Potato

fun main() {

    var myString = "This is my string"

    // IFs are expressions, just like in Scala
    val result = if(myString != "") {
        "Not Empty"

    }
    else{
        "String is empty"
        22
    }

//    result is a Kotlin.Unit -> Just like Unit in scala
    println(result)



    val whenValue = when(result) {
        "Not Empty" -> {
            println("Correct result")
            "It isnt empty"
        }
        is String -> {
            println("Excellent")
            "Breaking out after this statement"
        }

        is Int -> "Integer Result"
        else -> "It came to this"

    }

    // println is implicitly imported
    println(whenValue)


    Potato("Potaot")


}