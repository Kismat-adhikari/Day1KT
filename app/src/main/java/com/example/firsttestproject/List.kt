package com.example.firsttestproject

fun main() {

    // Immutable list
    val lst = listOf("one", "two", "three")
    println("Immutable List:")
    for (i in lst.indices) {
        println(lst[i])
    }

    println()

    // Mutable list
    val mutableList = mutableListOf("one", "two", "three")
    mutableList.add("four")
    println("Mutable List:")
    for (i in mutableList.indices) {
        println(mutableList[i])
    }
}
