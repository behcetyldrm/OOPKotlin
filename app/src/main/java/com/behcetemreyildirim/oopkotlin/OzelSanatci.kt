package com.behcetemreyildirim.oopkotlin

class OzelSanatci(isim: String, yas: Int, meslek: String) : Sanatci(isim, yas, meslek) {

    //Sanatci sınıfındaki tüm özellikleri miras alır. yani oradaki tüm özellikleri bu sınıfta kullanabiliriz
    //miras alınacak sıfının başına open koymalıyız

    fun sarkiSoyleniyor(){
        println("Şarkı söyleniyor")
    }

}