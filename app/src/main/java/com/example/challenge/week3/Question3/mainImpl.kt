package com.example.challenge.week3.Question3

fun birlestir(list1:ArrayList<Int>,list2:ArrayList<Int>): List<Int>{
     return (list1 + list2).sorted()
}

fun main() {
print(birlestir(arrayListOf(1,2,3), arrayListOf(1,2,3)))
}