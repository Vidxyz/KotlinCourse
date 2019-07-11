package com.vid.kotlin.stdlib

fun main() {

    // This is eager evaluation
    // Evaluates everything, and only then proceeds to next step
    val elements = 1..100
    /*
    elements
        .filter { it < 30 }
        .map { Pair("Yes", it) }
        .forEach {println(it)}
    */

    // This makes a sequence of it, would make for lazy eval
    // Keeps moving on to next step on at a time
    elements
        .asSequence()
        .filter { it < 30 }
        .map { Pair("Yes", it) }
        .forEach {println(it)}

    // take is like SQL LIMIT
    println(elements.asSequence().take(30).sum())

    // This does x + 10 + seed value
    val numbers = generateSequence(1) { x -> x + 10 }

    numbers.take(3).forEach { print(it.toString() + " ") }
    println("")

    println(numbers.take(3).sum())

    // Only initialized when lazyInit is called, not at compile time
    val lazyInit: Int by lazy { 10 }
}