package com.example.myapplication

class Person3 {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */

    val person: Person3 = Person3().apply {
        name = "Hey Android"
        age = 22
    }

    with(person) {
        println(name)
        println(age)
    }

    // Perform some other operations on 'person' object
    person.also {
        it.name = "Android with Kotlin"
        println("New name: ${it.name}")
    }
}