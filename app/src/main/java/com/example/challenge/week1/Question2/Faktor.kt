package com.example.challenge.week1.Question2

fun faktoriyel(n: Long): Long {
    return if (n == 1L) n else n * faktoriyel(n - 1)
}

fun main(){
print("Sayının faktoriyeli : ${faktoriyel(5)}")
}