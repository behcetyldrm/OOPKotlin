package com.behcetemreyildirim.oopkotlin

open class Sanatci (isim: String, yas: Int, meslek: String) {

    //Encapsulation

    var isim: String? = isim
        private set  //diğer yerlerde erişilebilir ama değişiklik yapılamaz
        get //diğer yerlerde erişilebilir

    private var meslek: String? = meslek //sadece bu dosyada erişilebilir

    var yas: Int? = yas //diğer yerlerde erişilebilir ve değiştirilebilir

}