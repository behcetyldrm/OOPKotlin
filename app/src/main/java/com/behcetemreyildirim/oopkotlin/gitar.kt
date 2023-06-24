package com.behcetemreyildirim.oopkotlin

class gitar : Enstruman, Dekorasyon { //bir sınıfa birden fazla miras bırakabilmek için interface kullanabiliriz

    var marka : String? = null
    var elektro: Boolean? = null

    override var oda: String //dekorasyon interface sınıfındaki değişkene değer ataması yaptık
        get() = "salon"
        set(value) {}

}