package com.example.communicationbetweenfragments.allfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.communicationbetweenfragments.R


class SecondFragment : Fragment() {

    var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_second, container, false)
        val msg:EditText = view.findViewById(R.id.textMSg)

        displayMessage = arguments?.getString("message")
        msg.setText(displayMessage)

        return view
    }
    


}