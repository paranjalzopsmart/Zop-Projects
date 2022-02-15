package com.example.communicationbetweenfragments

import android.widget.EditText

interface Communicator {
    fun passData(editTextInput: String)
}