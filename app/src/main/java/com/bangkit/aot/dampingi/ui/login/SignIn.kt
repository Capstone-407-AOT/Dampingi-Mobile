package com.bangkit.aot.dampingi.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.api.RetrofitClient
import com.bangkit.aot.dampingi.data.SignInRespone
import com.bangkit.aot.dampingi.databinding.ActivitySignInBinding
import com.bangkit.aot.dampingi.ui.main.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val signIn: Button = findViewById(R.id.btn_signIn)

        signIn.setOnClickListener {

            val etUsername: EditText = findViewById(R.id.username)
            val etPassword: EditText = findViewById(R.id.password)

            val name = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()



            if (name.isEmpty()) {
                etUsername.error = "type username"
                etUsername.requestFocus()
                return@setOnClickListener
            }
            if (password.toString().trim().isEmpty()) {
                etPassword.error = "enter password"
                etPassword.requestFocus()
                return@setOnClickListener
            }

            RetrofitClient.instance.LoginUser(name, password)
                .enqueue(object : Callback<SignInRespone> {
                    override fun onResponse(call: Call<SignInRespone>, response: Response<SignInRespone>) {
                        val intent = Intent(this@SignIn, MainActivity::class.java)
                        startActivity(intent)
                    }

                    override fun onFailure(call: Call<SignInRespone>, t: Throwable) {
                        Toast.makeText(applicationContext, "Login Failed", Toast.LENGTH_SHORT).show()
                    }

                })
        }
    }

}
