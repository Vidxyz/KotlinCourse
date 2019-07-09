package com.vid.kotlin.classes

// This is a singleton
object Global {
    val PI = 3.14
}

fun main() {

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
    println(Global.PI)
}