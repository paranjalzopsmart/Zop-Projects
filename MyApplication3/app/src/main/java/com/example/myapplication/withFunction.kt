package com.example.myapplication

class Person {
    var name: String = "ZopSmart"
    var age: Int = 10
}

fun main() {

    /** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    val person = Person()

    val X=with(person){
        println(name)
        println(age)
        age+2
    }
    println(X)
}