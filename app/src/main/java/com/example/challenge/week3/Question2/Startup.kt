package com.example.challenge.week3.Question2

fun tekSayilar(list: ArrayList<Int>) : List<Int> {
    return  list.filter { it%2!=0 }
}

fun main() {
    tekSayilar(arrayListOf(1,2,3,5,6)).forEach { println(it) }
}