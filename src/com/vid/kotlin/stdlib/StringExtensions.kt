package com.vid.kotlin.stdlib

import java.io.File

fun main() {

    val str: String = "A Test String"

    val file = File("filename.txt")

    with(file) {
        // Reference props of file
        isAbsolute
        isHidden
        //...
    }

    file.apply {
        isAbsolute
    }

    val string: String? = "Some Value"

    string?.let {
        it.length
        it.get(1)
    }

}