package com.example.challenge.week3.Question1

fun topla(list: ArrayList<Int>) : Int{
    var sum =0
    list.forEach { x->sum+=x }
    return sum
}

fun main() {
println(topla(arrayListOf(1,2,4)))
}