package com.example.challenge.week1.Question4

import java.util.Scanner

fun checkVowel(input : String) : Boolean? {
    val vowel = arrayListOf<String>("A","a","E","e","I","ı","İ","i","O","o","Ö","ö","U","u","Ü","ü")
    var success:Boolean?=null
    vowel.map{
        if (it == input) success = true
    }
    return success
}

fun main(){
    val  scanner = Scanner(System.`in`)

    println("Harf giriniz.")
    val input: String =scanner.next()

    if (checkVowel(input) == true){
        println("Sesli harftir.")
    }
    else println("Sessiz harftir.")

}