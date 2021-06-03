package com.bangkit.aot.dampingi.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.databinding.ActivitySignInBinding
import com.bangkit.aot.dampingi.databinding.ActivitySignUpBinding
import com.bangkit.aot.dampingi.ui.main.MainActivity

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val signIn: Button = findViewById(R.id.btn_signIn)

        signIn.setOnClickListener {
            signInUser()
        }
    }

    private fun signInUser() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        showLoading(true)
    }

    private fun showLoading(state: Boolean) {
        if(state){
            binding.loading.visibility = View.VISIBLE
        } else {
            binding.loading.visibility = View.GONE
        }

    }
}