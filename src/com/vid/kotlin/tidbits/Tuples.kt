package com.vid.kotlin.tidbits


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

}