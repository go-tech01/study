package com.haki.dimo

//타입추론
var a = 1234        //Int
var b = 1234L       //Long
var c = 12.45       //Double
var d = 12.45f      //Float
var e = true        //Boolean
var f = 'c'         //Char
var g = "abcd"      //String

//함수
fun sum1(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b //단일 표현식 함수(single-expression function)
//조건문
fun main(){
    var aa = 7
    if(aa > 10){
        println("aa는 10보다 크다")
    } else{
        println("aa는 10보다 작거나 같다")
    }



    dowhen(123L)
    dowhen("String이다")
    dowhen(213.4551)
    dowhen(1)
    dowhen("Dimo")
    dowh(2)
    dowh("Di")
    dowh(123L)
    dowh("String임")
    dowh(213.4551)
}



fun dowhen(aaa:Any){
    when(aaa){
        1 -> println("정수 1")
        "Dimo" -> println("디모의 코틀린 강좌")
        is Long -> println("자료형이 Long")
        !is String -> println("자료형이 String이 아님")
        else -> println("어떤 조건도 만족 안함")
    }
}


fun dowh(bbb:Any){                                    //표현식(expressions)
    var rs = when(bbb){
        2 -> "정수 2"
        "Di" -> "디입니다"
        is Long -> "자료형이 Long"
        !is String -> "자료형이 String이 아님"
        else -> "어떤 조건도 만족 안함"
    }
    println(rs)

}