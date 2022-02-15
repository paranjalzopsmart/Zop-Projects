package com.example.myapplication

import kotlin.properties.Delegates

// LAzy function
val pi: Float by lazy {
    3.14f
}

// observable functions
class Myself
{
    // Creating a Myself Class with String variable name
    var name: String by Delegates.observable("company name")
    {
        // default Previous value "company name"
            prop, old, new ->
        println("$old -> $new") // Old value is being
        // assigned a new value
    }
}

// string map functions

class Myself1(val map: Map<String, Any?>)
{
    // defining class Myself
    val my_name: String by map // Variable my_name
    val my_age: Int     by map // Variable my_age
}


fun main(args: Array<String>) {
     // calling lazy
    println("Some initial code.....")

    // pi is not initialised yet

    val area1 = pi * 4 * 4      // pi gets initialised and assigned the value of 3.14f for the first time

    val area2 = pi * 9 * 9      // The value pi is loaded from cache memory

    println("Some more code....")



    //  calling observable function

    val V1 = Myself()

    // Assigning name variable a new value "Previous to"
    V1.name = "Previous to"

    // Now again changing "Previous to " to "New Value" value
    V1.name = "New Value"




    // string map function

    val A = Myself1(mapOf(
        "my_name" to "I'm Paranjal",
        "my_age"  to 50))

    // Printing value of my_name variable
    println(A.my_name)

    // Printing value of my_age variable
    println(A.my_age)
}
