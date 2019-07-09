package com.vid.kotlin.tidbits

import java.io.BufferedReader
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.IndexOutOfBoundsException

class NotANumberException(message: String): Throwable(message) {
}


fun checkIsNumber(obj: Any) {
    when(obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main() {
    /*
    try {
        checkIsNumber("A")
    }
    catch(e: IllegalArgumentException) {
        println("Do nothing")
    }
    catch (e: NotANumberException) {
        println("${e.message}")
    }
    */

    val buffer = BufferedReader(FileReader(System.getProperty("user.dir") + "/src/com/vid/kotlin/tidbits/input.txt"))


    // Last value of catch block invoked is value of result. => -1
    val  result = try {
        val chars = CharArray(30)
        buffer.read(chars,0,40)
    }
    catch(e: IndexOutOfBoundsException) {
        println("Exception has been handled")
        -1
    }
    finally {
        println("Closing Buffer")
        buffer.close()
        -2 // this wont be the result
    }

    println(result)

}