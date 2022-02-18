package com.example.signinpageusingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signinpageusingviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstfrag = SigninFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstfrag)
            commit()
        }


    }
}