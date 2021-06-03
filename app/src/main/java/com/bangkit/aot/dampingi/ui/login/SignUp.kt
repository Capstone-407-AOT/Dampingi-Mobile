package com.bangkit.aot.dampingi.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val signUp: Button = findViewById(R.id.btn_signUp)

        signUp.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser() {
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
        showLoading(true)
    }

    private fun showLoading(state: Boolean) {
        if(state){
            binding.loading2.visibility = View.VISIBLE
        } else {
            binding.loading2.visibility = View.GONE
        }

    }
}