package com.example.challenge.week1.Question1

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val random= 55 /*Random.nextInt(0,101)*/

    val scanner = Scanner(System.`in`)

    var count = 1
    println("Lütfen sayıyı tahmin ediniz")
    var input = scanner.nextInt()

    while (!input.equals(random) ){
        println("Lütfen sayıyı tahmin ediniz")
        input =scanner.nextInt()
        if (input.equals(random)){
            println("Doğru bildiniz <3")
            println("Tahmin Sayısı : $count")
            break;
        }
        if(count ==5){
            println("5 deneme hakknız doldu.")
            break
        }
        count++
    }

    if (input.equals(random)){
        println("Doğru bildiniz <3")
        println("Tahmin Sayısı : $count")
    }

}