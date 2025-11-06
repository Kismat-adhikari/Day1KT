package com.example.firsttestproject


fun main() {
    println("Please enter 3 numbers:")

    val number1 = readln().toIntOrNull() ?: return println("Invalid input")
    val number2 = readln().toIntOrNull() ?: return println("Invalid input")
    val number3 = readln().toIntOrNull() ?: return println("Invalid input")

    val largestNumber = maxOf(number1, number2, number3)

    println("The largest number is $largestNumber")
}
