package com.bangkit.aot.dampingi.ui.fitur.darurat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.ui.main.MainActivity

class Darurat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_darurat)

        val back: ImageButton = findViewById(R.id.btn_back)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}