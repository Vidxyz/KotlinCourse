package com.vid.kotlin.inheritance

abstract class StoredEntity {

    val isActive = true

    fun status(): String {
       return isActive.toString()
    }

    abstract fun store()
}

class Employee: StoredEntity() {
    override fun store() {
        // Fill in implementation
    }
}

fun main() {
    val se = Employee()
    println(se.isActive)
    println(se.status())

}