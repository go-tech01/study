package com.haki.dimo

fun main(){
    var a = ps("보영", 1990)
    var b = ps("국진", 1975)
    var c = ps("혜", 1992)

    println("나는 ${a.nam} ${a.age}년생이다")
    println("저는요 ${b.nam}이고요 ${b.age}년에 태어났어요")
    println("히히 \"${c.nam}\"라고해 ${c.age}년생 반갑다")
    a.introduce()

    }


class ps(var nam:String, val age:Int){// -> 함수 없는 속성만 있는 클래스, ()안은 속성
     fun introduce(){println("안녕하세요  ${age}년생 ${nam}입니다")}
}
