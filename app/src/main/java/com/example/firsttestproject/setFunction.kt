package com.example.firsttestproject

fun main() {
    // Initialize the student marks map
    val studentMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )

    // Update/add some marks
    studentMarks["ram"] = 60
    studentMarks["sabin"] = 80

    println("Enter student name: ")
    val input = readln().trim().lowercase()

    // Lookup the mark safely
    val mark = studentMarks[input]
    if (mark != null) {
        println("Marks of $input: $mark")
    } else {
        println("Student '$input' not found.")
    }
}
