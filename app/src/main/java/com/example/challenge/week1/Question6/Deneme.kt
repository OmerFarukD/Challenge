package com.example.challenge.week1.Question6

import java.time.Month

// todo: Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana yazdıran bir programı nasıl yazarsınız?
fun main(){
val deger = getMonthNumber("Ocak")
 println(getSeason(deger))


}

fun getMonthNumber(month : String):Int{
 val monthDict = HashMap<Int,String>()
 monthDict.put(1,"Ocak")
 monthDict.put(2,"Şubat")
 monthDict.put(3,"Mart")
 monthDict.put(4,"Nisan")
 monthDict.put(5,"Mayıs")
 monthDict.put(6,"Haziran")
 monthDict.put(7,"Temmuz")
 monthDict.put(8,"Ağustos")
 monthDict.put(9,"Eylül")
 monthDict.put(10,"Ekim")
 monthDict.put(11,"Kasım")
 monthDict.put(12,"Ekim")

 for ((key, value) in monthDict) {
  if (value == month) {
   return key
  }
 }

return 0
}


fun getSeason(month: Int):String{

 when{
  month in 1..2-> return "Kış"
  month in 3..5-> return "İlkbahar"
  month in 6..8-> return "Yaz"
  month in 9..10-> return "Sonbahar"
  month in 11..12-> return "Kış"
 }
return ""
}
