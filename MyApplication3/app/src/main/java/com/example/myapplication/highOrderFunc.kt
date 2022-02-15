package com.example.myapplication
//defining a lambda  expression
var Z= {a: Int, b: Int-> a*b}


// high order function accepting lambda as a parameter

//->Int means it returns an integer
fun highOrderFunc(lambda :(Int,Int)->Int){
    var res = lambda(2,4)
    println("The product is: $res")
}

// calling high iorder function by passing Z as an parameter
fun main(args: Array<String>){
    highOrderFunc(Z)


}