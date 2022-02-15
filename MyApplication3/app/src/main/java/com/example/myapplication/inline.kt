package com.example.myapplication


fun A(str :String, xyz :(String)->Unit) {  // xyz calls print function by passing string as input
    xyz(str)
}

fun main(args: Array<String>){
    print("Hii, I am Paranjal ")
    println("Android Developer at ZopSmart")
}