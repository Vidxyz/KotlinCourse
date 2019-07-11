package com.vid.kotlin.interop

// if const, accessible as a field in java
val copyRightYear = 2016

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}