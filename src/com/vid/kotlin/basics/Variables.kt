package com.vid.kotlin.basics


fun main(args: Array<String>) {

    // Variables - there are mutable
    var streetNumber: Int = 10
    var streetName: String = "Spadina Avenue"
    var streetName2 = "Spadina Avenue"


    // Immmutable variables
    val zip = "E11 P1"


    // EVERYTHING is an object
    val myInt: Int = 44
    val myNumber: Byte

    val myLong = 10L
    val myFloar = 10F
    // 0x0F is hex
    // Oxb01 is binary
    // Bitwise operators also exist

    // No explicit conversion
    val myInte = 100
    val myLongAgain: Long = myInt.toLong()

    val myChar = 'A'
    val myString = "My String"
    val escapeChars = "A new line \n"

    val rawString = " Hello" +
            "This is a second line" +
            "A third line"

    val multipleLines = """
        This is a string
        This is another line
        This is the final line
    """.trimIndent()


    val years = 10
    // String interpolation
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"




}
