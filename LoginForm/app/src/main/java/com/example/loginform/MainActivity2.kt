package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class MainActivity2 : AppCompatActivity() {

    val tag:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle=intent.extras
        var name: String? =bundle?.getString("name")
        var age: String? =bundle?.getString("age")
        var jobid: String? =bundle?.getString("jobID")
        var phone: String? =bundle?.getString("phone")
        Log.d(tag,name.toString()+" "+age.toString()+" "+jobid.toString()+" "+phone.toString())
    }
}