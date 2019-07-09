package com.vid.kotlin.tidbits

import com.vid.kotlin.classes.CustomerKotlin


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 23000000)
}

fun countryInfo(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "europe", 2300000)
}

fun main() {

    val result = capitalAndPopulation("Madrid")

    println(result.first)
    println(result.second)

    var info = countryInfo("Madrid")
    println(info.first)
    println(info.second)
    println(info.third)


    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    val (capital1, continent, population1) = countryInfo("Madrid")
    println(capital1)
    println(continent)
    println(population1)

    val (id, name, email) = CustomerKotlin(1, "Name", "email")
    println(id)
    println(name)
    println(email)

    // Syntactic Sugar
    val listOfCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for((capital, country) in listOfCapitalsAndCountries) {
        println("$capital - $country")
    }



}