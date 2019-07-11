package com.vid.kotlin.stdlib

import java.util.*

fun main() {

    var list: List<String> = ArrayList()

    // Read only list
    var list2 = listOf("First Entry", "Second entry")
    var emptyList = emptyList<String>()

    val numbers = 1..100

    // Can't add elements to this, since it is immutable
    val cities = listOf("Madrid", "London", "Paris")

    println(cities.javaClass)
    println(emptyList.javaClass)

    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)

    val mutableCities = mutableListOf<String>("Madrid", "London", "Paris")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("First", "Second"))

    var booleans = booleanArrayOf(true, false, true)

    val chars = charArrayOf('a', 'v', 'c')



}