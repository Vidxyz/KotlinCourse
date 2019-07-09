package com.vid.kotlin.basics

// MAIN FUNCTION PER DIFFERENT FILE
// NOT ONE MAIN FUNCTION PER PACKAGE

fun main(args: Array<String>) {


    for(a: Int in 1..100) {
        println(a)
    }


    // List of numbers
    val numbers = 1..100

    for (a in numbers) {
        println(numbers)
    }

    for(a in 100 downTo 1) {
        println(a)
    }

//    for(a in 100 .. 1) {
//        println(a)
//    }

    for (b in 100 downTo 1 step 1) {
        println(b)
    }

     val capitals = listOf("London", "Paris", "Rome", "Madrid")
    for (capital in capitals) {
        println(capital)
    }

    var i = 100
    while(i > 0) {
        i--
    }

    var x = 10
    do {
        x--
    } while(x > 0)

    // Kotlin provides break and continue

    loop@ for(i in 1..100) {
        loop2@ for (j in 1..100) {
            if(j % i == 0) {
                break@loop
            }
        }
    }





}