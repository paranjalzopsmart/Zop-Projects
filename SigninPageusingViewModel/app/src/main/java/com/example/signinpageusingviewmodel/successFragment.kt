package com.example.signinpageusingviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


public final class successFragment : Fragment(R.layout.fragment_success) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getActivity()?.setTitle("Successfully Login");

    }
}