package com.vid.kotlin.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun sum(x:Int, y:Int): Int = x + y

fun unaryOp(x: Int, op: (Int) -> Int): Int {
   return op(x)
}

fun unaryOperation(op: (Int) -> Int) {

}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {

    }
}

fun main() {
    // Need to use :: operator
    println(operation(1, 2, ::sum))


    // Parameter type specification is not necessary
    // Keep an eye out for syntactic sugar...

    println(operation(1, 2, {x, y -> x + y}))

    val sumLambda: (Int, Int) -> Int = {x, y -> x + y}

    println(unaryOp(5, {x -> x * x} ))

    println(unaryOp(5, { it * it}))

    println(unaryOp(5) { it * it})

    // If the last or ONLY param of a func is a func, then you dont need brackets
    println(unaryOperation { it * it })



    // Example of why the syntactic sugar above is useful
    val db = Database()

    transaction(db) {
        // Interact with DB -> Add execution code here
    }



    // Anonymous functions. Useful for multiple return points
    // LAMBDAS can only have ONE return point. Anonymous functions can have multiple
    unaryOp(5, fun(x: Int): Int { return x * x})



}