package com.example.signinpageusingviewmodel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.signinpageusingviewmodel.databinding.ActivityMainBinding
import com.example.signinpageusingviewmodel.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    private lateinit var binding: FragmentSigninBinding

    private lateinit var viewModel: SigninViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("GameFragment", "Called ViewModelProvider.get")

        val secondfrag = successFragment()
        binding = FragmentSigninBinding.inflate(layoutInflater)
        (binding.root)

        viewModel=ViewModelProvider(this).get(SigninViewModel::class.java)




        binding.signBtn.setOnClickListener {
            var mail: String = binding.et1.text.toString()
            var pass: String = binding.et2.text.toString()

            if(checkSignin(mail, pass)){
                activity?.supportFragmentManager?.beginTransaction()?.apply {
                    replace(R.id.flFragment, secondfrag)
                    commit()
                }
            }
            binding.et1.error = "fields are typed wrong"
            return@setOnClickListener

        }
        return binding.root
    }

    fun checkSignin(email: String, password: String): Boolean{
        return  viewModel.checkSignin(email, password)
    }
}