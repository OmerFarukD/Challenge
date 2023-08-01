package com.example.challenge.week3.Question5

fun isContain(number : Int, numbers: HashSet<Int>): Boolean{
    if (numbers.contains(number)) return true
    return false
}

fun main() {
    val hash = HashSet<Int>()
    hash.add(1)
    hash.add(2)
    hash.add(4)
    println( isContain(5,hash ))

}