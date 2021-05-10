package com.bangkit.aot.dampingi.ui.fitur.pelaporan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.ui.main.MainActivity

class Pelaporan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelaporan)

        val back: ImageButton = findViewById(R.id.btn_back)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}