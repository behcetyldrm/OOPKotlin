package com.behcetemreyildirim.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("----Sınıflar----")

        val kullanici = Kullanici("Behçet", 16) //sınıfımızdan bir obje oluşturduk
        val digerKullanici = Kullanici("Atıl", 32)


        println("----Encapsulation----")

        val behcet = Sanatci("Behçet", 16, "gitarcı")
        println(behcet.isim)
        //behcet.isim = "Atıl"


        println("----Inheritance----") //Miras alma özelliğidir
        val atil = OzelSanatci("Atıl", 32, "Yazılımcı")
        atil.sarkiSoyleniyor()
        println(atil.isim)


        println("----Polymorphism----")

        //Statik Polymorphism -> Aynı adda ve türde fonksiyonlar oluşturup. hepsinde farklı parametreler alabiliriz

        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))

        //Dinamik Polymorphism

        val kopek = Hayvan()
        kopek.sesCikar()

        val teyipcan = kedi()
        teyipcan.sesCikar()
        teyipcan.kediFonk()


        println("----Abstraction & Interface----") //soyut sınıftan obje oluşturulamaz

        val gizem = Kullanici("Gizem", 18)
        gizem.insanFonk()

        val gitar = gitar()
        gitar.marka = "Gitar markası"
        gitar.elektro = true
        gitar.bilgi()
        println(gitar.oda)


        println("----Lambda Gösterimleri----")

        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString: String -> println(verilenString)} //aşağıda yazılan fonksiyon ile aynı işlemi yapar
        yazdigimiYazdirLambda("test lambda")

        val carpmaLambda = {a: Int, b: Int -> a * b} //geriye değer döndürür
        println(carpmaLambda(6,7))

        val carpmaLambdaV2 : (Int, Int) -> Int = {a,b -> a * b} //2. yöntem 2 tane int alınacak ve int döndürürecek dedik değerleri sonra tanımladık
        println(carpmaLambdaV2(6,7))

    }

    fun yazdigimiYazdir(string: String){
        println(string)
    }
}