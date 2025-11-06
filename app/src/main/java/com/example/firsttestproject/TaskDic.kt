package com.example.firsttestproject

fun main() {
    // Create a simple dictionary using mapOf function
    val dictionary = mapOf(
        "apple" to "A fruit that is usually red, green, or yellow.",
        "book" to "A set of pages with written or printed material.",
        "computer" to "An electronic device for storing and processing data.",
        "sun" to "The star at the center of our solar system."
    )

    // Ask the user to enter a word
    println("Enter a word: ")
    val word = readln().trim().lowercase()

    // Lookup the meaning
    val meaning = dictionary[word]

    if (meaning != null) {
        println("Meaning: $meaning")
    } else {
        println("Sorry, the word '$word' is not in the dictionary.")
    }
}
