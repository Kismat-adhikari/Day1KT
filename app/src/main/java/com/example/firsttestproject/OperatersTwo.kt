package com.example.firsttestproject

fun main() {
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = ${+number}")   // unary plus
    println("-number = ${-number}")   // unary minus
    println("++number = ${++number}") // pre-increment
    println("--number = ${--number}") // pre-decrement
    println("!isCheck = ${!isCheck}") // logical NOT

    println("---")

    var result: Double = 4.7
    println("Original result: $result")

    println("result++ (post-increment): ${result++}") // prints original first, then increments
    println("After post-increment, result = $result") // shows incremented value

    println("++result (pre-increment): ${++result}")  // increments first, then prints
}
