package com.bangkit.aot.dampingi.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.api.RetrofitClient
import com.bangkit.aot.dampingi.data.DataSignUp
import com.bangkit.aot.dampingi.data.SignUpRespone
import com.bangkit.aot.dampingi.databinding.ActivitySignUpBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Body


class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

            RetrofitClient.instance.addRegister( //masih belum diedit ini
                @Body dataSignUp: DataSignUp
            )
                .enqueue(object : Callback<DataSignUp> {
                    override fun onResponse(
                        call: Call<DataSignUp>,
                        response: Response<DataSignUp>
                    ) {
                        Toast.makeText(applicationContext,response.body()?.access, Toast.LENGTH_SHORT).show()
                    }

                    override fun onFailure(call: Call<DataSignUp>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
                    }

                })
        }
    }
}