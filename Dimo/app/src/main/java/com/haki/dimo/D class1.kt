package com.haki.dimo

fun main(){
    var a = ps1("보영", 1990)
    var b = ps1("국진", 1975)
    var c = ps1("혜", 1992)
    var d = ps1("무협이")
    var e = ps1("보고파")
}

class ps1(var nam:String, val age:Int){
    init{
        println("${this.age}년생인 ${this.nam}입니다")
    }
    constructor(nam:String):this(nam,1997)
    {println("똑같은 나이들이다")}
}