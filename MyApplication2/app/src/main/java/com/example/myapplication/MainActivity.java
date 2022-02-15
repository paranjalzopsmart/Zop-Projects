package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main";

    public Button submitBtn ;
    EditText Name, Phone, Age, Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        Phone= findViewById(R.id.Phone);
        Age=findViewById(R.id.Age);
       Name=findViewById(R.id.Name);
       Email=findViewById(R.id.Email);

       //setting onclick to the button
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("Name", Name.getText().toString());
                intent.putExtra("Age", Age.getText().toString());
                intent.putExtra("Phone", Phone.getText().toString());
                intent.putExtra("Email", Email.getText().toString());
                startActivity(intent);
            }
        });

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "OnStart Called");
//    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "On resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"on pause called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "on restart called");
    }

//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(tag)
//    }
}