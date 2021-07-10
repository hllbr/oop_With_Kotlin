package com.hllbr.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Kotlin-Java-Python-Swift oop dilleridir.
        C gibi ilkel dillerde bu özellikler bulunmuyordu

       OOP 4 TEMEL PRENSİP(Konsept) ÜZERİNDE KURULDUR
       Abstract
       Encapsulation
       Inheritance
       Polymorphism
       OOP dillerinde genellikle sınıflar üzerinde çalışılır.Sınıflardan objeler üretilir.bu objelere sınıfın instance'ı da denir.
       Applerin nasıl çalıştığını belirleyen en büyük temel yapı taşı sınıf

         */
        var name : String = "myString"
       /*BASİT CLASS EXAMPLE
        var myUser = User()
        myUser.age = 25
        myUser.name = "Hllbr"

        println("myUserName = "+myUser.name.toString())
        println("myUserAge = "+myUser.age)

        Basit constructor example

        var myUser = User("James",50)
        println("name : "+myUser.name)
        println("Age : "+myUser.age)
        myUser.age = 65
        myUser.name = "rbllh"
        println("name : "+myUser.name)
        println("age : "+myUser.age)
        */

    }
}