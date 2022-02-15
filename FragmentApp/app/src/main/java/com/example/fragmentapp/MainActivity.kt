package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentapplication.FirstFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        val apply = supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }

            btn2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, secondFragment)
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}