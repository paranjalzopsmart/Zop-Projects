package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    var name: EditText? = null
    var number: EditText? = null
    var email: EditText? = null
    var jobId: EditText? = null
    var resetButton: Button? = null
    var submitButton: Button? = null
    var isNameISEmpty = false
    var isNumberISEmpty = false
    var isJobIdISEmpty = false
    var isEmailIsEmpty = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Views()
        ResetForm()
        submitButton?.isEnabled = false
//        if (!(name?.text!!.isEmpty() || number?.text!!.isEmpty() || email?.text!!.isEmpty() || jobId?.text!!.isEmpty())) {
//            submitButton?.isEnabled = true
//        }
        name?.addTextChangedListener {
            isNameISEmpty = !it.isNullOrEmpty()
            enableDisableView(isNameISEmpty, isNumberISEmpty, isJobIdISEmpty,isEmailIsEmpty)
        }
        number?.addTextChangedListener {
            isNumberISEmpty = !it.isNullOrEmpty()
            enableDisableView(isNameISEmpty, isNumberISEmpty, isJobIdISEmpty,isEmailIsEmpty)
        }
        jobId?.addTextChangedListener {
            isJobIdISEmpty = !it.isNullOrEmpty()
            enableDisableView(isNameISEmpty, isNumberISEmpty, isJobIdISEmpty, isEmailIsEmpty)
        }
        email?.addTextChangedListener {
            isEmailIsEmpty = !it.isNullOrEmpty()
            enableDisableView(isNameISEmpty, isNumberISEmpty, isJobIdISEmpty, isEmailIsEmpty)
        }


        submitButton?.setOnClickListener(View.OnClickListener { v->
            val intent = Intent(this, MainActivity2::class.java)
            val bundle=Bundle()
            bundle.putString("name",name?.text.toString())
            bundle.putString("age",number?.text.toString())
            bundle.putString("jobID",email?.text.toString())
            bundle.putString("phone",jobId?.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
            Toast.makeText(this, "Form Submitted Successfully!!   ", Toast.LENGTH_LONG).show()
        })


    }

    private fun enableDisableView(
        isNameIsNotNull: Boolean,
        sNumberIsNotNull: Boolean,
        sEmailIsNotNull: Boolean,
        sJobIsNotNull: Boolean
    ) {
        if (isNameIsNotNull && sNumberIsNotNull && sEmailIsNotNull && sJobIsNotNull) {
            submitButton?.apply {
                isEnabled = true
            }
        } else {
            submitButton?.apply {
                isEnabled = false
            }
        }

    }


    private fun Views() {
        name = findViewById(R.id.textName)
        number = findViewById(R.id.textNumber)
        email = findViewById(R.id.textEmail)
        jobId = findViewById(R.id.jobID)
        resetButton = findViewById(R.id.resetButton)
        submitButton = findViewById(R.id.submitButton)
    }

    private fun ResetForm() {
        resetButton?.setOnClickListener(View.OnClickListener { v ->
            name?.setText("")
            number?.setText("")
            email?.setText("")
            jobId?.setText("")
        })

    }


}