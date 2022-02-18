package com.example.signinpageusingviewmodel

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signinpageusingviewmodel.databinding.FragmentRecyclerBinding
import com.example.signinpageusingviewmodel.databinding.FragmentSigninBinding


public final class FragmentRecycler : Fragment(R.layout.fragment_recycler) {
    var dataName:List<List<String>> = listOf(listOf("Paranjal Dwivedi", "paranjal.dwivedi@zopsmart.com"), listOf("Akansha Latiyan", "akansha.singh@zopsmart.com"), listOf("Sahej Singh", "sahej.singh@zopsmart.com"), listOf("Vijay Sethia", "vijay.sethia@zopsmart.com"), listOf("Ananya Agarwal", "ananya.agarwal@zopsmart.com"), listOf("Samarth Garg", "samarth.garg@zopsmart.com"), listOf("Akash Gupta", "Akash.gupta@zopsmart.com"),
        listOf("Manmohan Kumar", "manmohan.singh@zopsmart.com"), listOf("Divya R", "divya.r@zopsmart.com"), listOf("Narendran Anil", "Narendran.anil@zopsmart.com") )

    lateinit var binding: FragmentRecyclerBinding
    var layoutManager: RecyclerView.LayoutManager?=null


    var adapter: RecyclerView.Adapter<dataAdapter.ViewHolder>?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRecyclerBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("adapter", dataName.size.toString())
        binding.recycler.apply {
            layoutManager= LinearLayoutManager(activity)
            adapter=dataAdapter(dataName)
        }
    }

}