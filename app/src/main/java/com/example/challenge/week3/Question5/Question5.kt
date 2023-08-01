package com.example.challenge.week3.Question5

fun listele(list : ArrayList<Int>) : HashSet<Int>{
    var hashList = HashSet<Int>()

     list.forEach{ hashList.add(it)}

    return hashList
}


fun main() {
    println(listele(arrayListOf(1,1,2,2,3,3)))
}