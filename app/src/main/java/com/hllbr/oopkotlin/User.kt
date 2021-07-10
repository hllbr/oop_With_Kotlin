package com.hllbr.oopkotlin

class User {
    //Property
    var name : String? = null
    var age : Int? = null

    /*
    Constructor = inşa etmek anlamına gelir ve sınıfın objelerini inşa etmek olarak algılayabiliriz.
    Her obje oluşturulduğunda constructor olarak bilenen yapı çağrılacaktır.
    JAVA VE KOTLİN de konsept böyleyken PYTHON'da bu yapının benzeri var İNİT
    Çoğu programlama dilinde ikisi aynı şey fakat kotlinde farklı kullanımlarıda var

     */
    constructor(nameInput:String,ageInput:Int){
        this.name = nameInput
        this.age = ageInput
        //this anahtar kelimesi genellikle bir üst sınıfa(kapsayan) referans verir.
        println("user created")
    }
    /*
    İnitializer = başlatıcı olarak ifade edebiliriz.Bu kısımda sınıftan bir obje oluşturulduğunda ilk çağrılan yapılarımızdandır.
    Constructor kotlin içerisinde bu şekilde kullanılmaz.Primary constructor şeklinde kullanılır.
    Primary constructor içerisinde sadece tanımlama şeklinde ifade yapılıyor.
    yazdırma gibi işlemleri ifade etmek için init'i kullanmayı tercih ediyoruz
    init hız bakımından constructordan önde olarak ifade edebiliriz.Yazdırma bilgilendirme gibi işlemleri init içerisinde ifade ediyoruz önce init ile bilgilendirme verdikten sonra tanımlamaları devreye almadığımızı varsayabiliriz.

     */
init{

}
}