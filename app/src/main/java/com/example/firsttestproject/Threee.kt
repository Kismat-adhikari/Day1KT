package com.example.firsttestproject

import kotlin.random.Random

fun main() {
    // Generate a random number between 0 and 9999
    val number = Random.nextInt(0, 10000)

    println("Please enter any number from 0 to 10000:")

    while (true) {
        val userGuess = readln().toIntOrNull() // safer input handling
        if (userGuess == null) {
            println("Please enter a valid number.")
            continue
        }

        when {
            userGuess == number -> {
                println("Congratulations!!!! You won!")
                break
            }
            userGuess < number -> println("Increase your guess")
            else -> println("Decrease your guess")
        }
    }
}
