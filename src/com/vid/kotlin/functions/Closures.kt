package com.vid.kotlin.functions

import com.vid.kotlin.functional.unaryOp


fun outsideFunction() {
    for (number in 1..30) {
        // Value being captured does not stay constant, it varies each time as expected
        println(unaryOp(20) { x ->
            println(number)
            x * number
        })
    }

//    unaryOp(20, { x -> x * number})
//    // These both are equivalent. Value captured in a closure
//    unaryOp(20) { x -> x * number}
}

fun main() {
    outsideFunction()
}