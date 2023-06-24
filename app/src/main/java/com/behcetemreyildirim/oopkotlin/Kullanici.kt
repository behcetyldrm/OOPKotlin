package com.behcetemreyildirim.oopkotlin

class Kullanici : Insan {

    var isim : String? = null
    var yas : Int? = null

    constructor(isim: String, yas: Int){ //her obje oluşturuluğudunda çağrılır

        this.isim = isim
        this.yas = yas

        println("constructor çağrıldı")
    }

    init { //her obje oluşturuluğudunda çağrılır. constructordan önce çalışır
        println("init çağrıldı")
    }
}