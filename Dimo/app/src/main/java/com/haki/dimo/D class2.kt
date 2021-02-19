package com.haki.dimo

fun main(){
    var a = Ani("다롱이", 5, "댕댕이")
    var b = dde("다롱이", 5)
    a.it()
    b.gg()
    b.it()

    var c = cat("삐순이",2)
    c.cc()
    c.it()
}

open class Ani(var name:String,var age:Int,var type:String){
    fun it(){
        println("${type}이고 ${name}에요. ${age}살입니다")
    }
}
class dde(name:String, age:Int) : Ani(name, age, "댕댕이"){
    fun gg(){print("왈왈   ")}
}
class cat(name:String, age:Int) : Ani(name, age, "야옹이"){
        fun cc() {print("야옹~   ")}
    }