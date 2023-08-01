package com.example.challenge.week1.Question5

data class Student
    (val name :String, val surname:String,val room:String){

        fun features(): String{

            return  "Adı : $name, Soyadı : $surname , Sınıfı : $room"
        }

    }
