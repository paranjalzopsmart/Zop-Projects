package com.example.signinpageusingviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.fido.fido2.api.common.RequestOptions

class dataAdapter(private val mList: List<List<String>>): RecyclerView.Adapter<dataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.datalist, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val dataViewModel = mList[position]
        holder.textView.text = mList[position][0]
        holder.textView1.text = mList[position][1]
        //holder.imageView.setImageResource(dataViewModel.image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }



    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val textView: TextView = itemView.findViewById(R.id.empName)
        //val imageView: ImageView = itemView.findViewById(R.id.empImg)
        val textView1: TextView = itemView.findViewById(R.id.empEmail)

    }



}