package com.bangkit.aot.dampingi.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bangkit.aot.dampingi.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup: Button? = findViewById(R.id.btn_signup)
        val email: Button = findViewById(R.id.btn_email)

        signup!!.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        email.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }



    }
}