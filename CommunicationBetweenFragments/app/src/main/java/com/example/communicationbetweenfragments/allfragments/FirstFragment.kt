package com.example.communicationbetweenfragments.allfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.communicationbetweenfragments.Communicator
import com.example.communicationbetweenfragments.R


class FirstFragment : Fragment() {


    private lateinit var communicator: Communicator


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):
            View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)
        val btn1: Button = view.findViewById(R.id.sendBtn)

        communicator= activity as Communicator

        btn1.setOnClickListener{
            communicator.passData(view?.findViewById<EditText>(R.id.message)?.text.toString())
        }
        return view

    }



}