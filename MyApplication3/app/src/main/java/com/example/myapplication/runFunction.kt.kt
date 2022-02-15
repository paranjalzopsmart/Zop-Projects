package com.example.myapplication

class Person2 {
    var name: String = "Person 2 is cool"
    var age: Int = 1111
}

fun main() {

    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person: Person2? = Person2()

    val bio = person?.run {
        println(name)
        println(age)
        age + 10  // will be returned and stored in 'bio' variable
    }

    println(bio)
}