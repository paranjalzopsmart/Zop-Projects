package com.example.communicationbetweenfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.communicationbetweenfragments.allfragments.FirstFragment
import com.example.communicationbetweenfragments.allfragments.SecondFragment

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment=FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.flFrame, firstFragment).commit()
    }


    override fun passData(editTextInput: String) {
        val bundle=Bundle()
        bundle.putString("message", editTextInput)


        val transaction=this.supportFragmentManager.beginTransaction()
        val secondFragment=SecondFragment()
        secondFragment.arguments=bundle


        transaction.replace(R.id.flFrame,secondFragment)
        transaction.commit()
    }
}