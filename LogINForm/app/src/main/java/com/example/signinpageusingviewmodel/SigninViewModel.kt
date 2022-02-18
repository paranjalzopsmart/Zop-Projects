package com.example.signinpageusingviewmodel

import android.text.TextUtils
import androidx.lifecycle.ViewModel

class SigninViewModel: ViewModel() {

    fun checkSignin(email: String, password: String): Boolean{

        if (password.isBlank())
            return false
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    }
}
/*

        if (pwd.isBlank())
            return false
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
 */