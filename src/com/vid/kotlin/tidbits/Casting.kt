package com.vid.kotlin.tidbits

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if(days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}


fun hasVacations(obj: Person) {
    // Obj is being smart casted over here
    if(obj is Employee) {
        obj.vacationDays(20)
    }
    else {
        // No ide option for the method
    }
}


var input: Any = 10

fun main() {

    // Cast exception is nullified with ? operator
    var str = input as? String
    println(str?.length)

}