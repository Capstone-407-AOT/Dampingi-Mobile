package com.bangkit.aot.dampingi.ui.login

import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.api.RetrofitClient
import com.bangkit.aot.dampingi.data.DataSignUp
import com.bangkit.aot.dampingi.data.SignUpRespone
import com.bangkit.aot.dampingi.databinding.ActivitySignUpBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT > 9) {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }

        val signUp: Button? = findViewById(R.id.btn_signUp)

        signUp!!.setOnClickListener {
            val etUsername: EditText = findViewById(R.id.username)
            val etEmail: EditText = findViewById(R.id.email)
            val etPassword: EditText = findViewById(R.id.password)
            val etPassword2: EditText = findViewById(R.id.password2)


            val name = etUsername.text.toString().trim()
            val email = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val password2 = etPassword.text.toString().trim()

            if (name.isEmpty()){
                etUsername.error = "type a username"
                etUsername.requestFocus()
                return@setOnClickListener
            }
            if (email.isEmpty()){
                etEmail.error = "type a valid email "
                etEmail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                etPassword.error = "type a password"
                etPassword.requestFocus()
                return@setOnClickListener
            }
            if (password2.isEmpty()){
                etPassword2.error = "type same password"
                etPassword2.requestFocus()
                return@setOnClickListener
            }
            val user = DataSignUp(
                etUsername.toString(),
                etEmail.toString(),
                etPassword.toString(),
                etPassword2.toString()
            )

            RetrofitClient.instance.addRegister(user)
                .enqueue(object : Callback<SignUpRespone> {
                    override fun onResponse(
                        call: Call<SignUpRespone>, response: Response<SignUpRespone>
                    ) {
                        Toast.makeText(
                            applicationContext,
                            response.body()?.access,
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onFailure(call: Call<SignUpRespone>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
                    }

                })


       }
    }
}