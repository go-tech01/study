package com.haki.dimo

fun main(){
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    while(a < 5){
        (a++)}
    println()
    while(b < 5){
        (++b)}
    println()
    do {
        (c++)
    } while (c <5)
    println()
    do {
        (++d)
    } while (d <5)

    for(i in 0..9){
        print(i)}
    println()
    for(i in 0..9 step 4){
        print(i)}
    println()
    for(i in 9 downTo 6){
        print(i)}
    println()
    for(i in 'a'..'f'){
        print(i)}
    println()

    for(i in 1..5){
        if(i == 3)break
        print(i)}
    println()
    for(i in 1..5){
        if(i == 3)continue
        print(i)}
    println()

    lab@for(i in 1..10){
        for(j in 5..8){
            if(i == 2 && j == 6)break@lab
            println("i= $i, j = $j")
        }
    }

}