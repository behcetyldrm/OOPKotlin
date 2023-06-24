package com.behcetemreyildirim.oopkotlin

class kedi : Hayvan() {

    fun kediFonk(){
        super.sesCikar() //miras aldığı sınıftaki fonksiyonu kullanır
    }

    override fun sesCikar(){ //override -> üstüne yazma işlemidir. miras alınann sınıfta aynı adda fonk. olduğundan yazılır. miras fonk.'u ezer
        println("kedi sınıfı")
    }
}