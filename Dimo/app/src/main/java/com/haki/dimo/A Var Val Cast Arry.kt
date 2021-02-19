package com.haki.dimo

fun main(){
    //Val Var
    val aa:Int
    aa = 10
    var bb:Int = 5
    var cc = 8
    val dd = "알겠어"

    //println("$aa, $bb, $cc, $dd")

    //Type Casting
    val ee:Int=5
    var LL = ee.toLong() // 명시적 형변환(explicit type casting)
    //println(LL)

    //Array
    var intArr = arrayOf(1,2,3,4,5)
    println(intArr[1])
    intArr[1] = 7
    println(intArr[1])
    println(intArr[3])
    var arr1 = listOf(1,2,3,4,5)            //센치한
    var arr2 = mutableListOf(6,7,8,9,10)    //센치한





}