package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import java.util.jar.Attributes

class MainActivity2 : AppCompatActivity() {

    lateinit var Name:String;
    lateinit var Age:String;
    lateinit var Email:String;
    lateinit var Phone:String;


    val TAG="MAinActivity2";



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Name=intent.getStringExtra("Name")!!
        Age=intent.getStringExtra("Age")!!
        Email=intent.getStringExtra("Email")!!
        Phone=intent.getStringExtra("Phone")!!

        val data:String=Name+" "+Age+" "+Email+" "+Phone

        Log.d(TAG,data)

    }
}