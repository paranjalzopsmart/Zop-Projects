package com.example.myapplication

open  class extensions(val a:Int, val b:Int) {
}
class extends1():extensions(5,5){}

fun main(){
    //extension fun operate defined for extensions class
    fun extensions.operateee():Int {
        return a+b
    }



    var e=extensions(4,5)
    println(e.operateee())
}