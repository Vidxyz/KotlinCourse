package com.vid.kotlin.classes

enum class Priority(val value: Int) {
    MINOR(-1){
        override fun toString(): String {
            return  "Minor Priority"
        }

        override fun text(): String {
            return "[MINOR PRIORITY]"
        }
    },
    MAJOR(0) {
        override fun text(): String {
            return "[MAJOR PRIORITY]"
        }
    },
    NORMAL(1) {
        override fun text(): String {
            return "[NORMAL PRIORITY]"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "[CRITICAL PRIORITY]"
        }
    };



    abstract fun text(): String
}

fun main() {
    val priority = Priority.NORMAL
    val priority1 = Priority.MINOR

    println(priority1)
    println("\n")

    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println('\n')
    println(Priority.CRITICAL.name)
    println(Priority.CRITICAL.value)
    println(Priority.CRITICAL.ordinal)
    println('\n')

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    println('\n')
    val p = Priority.valueOf("MAJOR")
    println(p)
    println(p.ordinal)
}