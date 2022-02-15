package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG="MainActivity";
    lateinit var  Name : EditText;
    lateinit var Age: EditText;
    lateinit var  Email:EditText;
    lateinit var Phone:EditText;
    lateinit var submitBtn:Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Name=findViewById(R.id.Name);
        Age=findViewById(R.id.Age);
        Phone=findViewById(R.id.Phone);
        Email=findViewById(R.id.Email);
        submitBtn=findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(View.OnClickListener { v->
            val intent=Intent(this, MainActivity2::class.java);
            intent.putExtra("Name", Name.text.toString());
            intent.putExtra("Age", Age.text.toString());
            intent.putExtra("Email", Email.text.toString());
            intent.putExtra("Phone", Phone.text.toString());
            startActivity(intent);
         })


    }
}