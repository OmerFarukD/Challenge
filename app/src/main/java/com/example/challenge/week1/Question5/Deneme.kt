package com.example.challenge.week1.Question5
 // TODO: Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın. Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın
fun main (){
    val student= Student("Ömer","Doğan","12a")
    val student1= Student("Faruk","Doğan","12b")
    val student2= Student("Ömer","Faruk","11a")
    val student3= Student("Mauro","Icardi","10a")
    val student4= Student("Wilfried","Zaha","11a")
     println(student.features())
     println(student1.features())
     println(student2.features())
     println(student3.features())
     println(student4.features())
}