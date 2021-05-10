package com.bangkit.aot.dampingi.ui.fitur.pendampingan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.ui.main.MainActivity

class Pendampingan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendampingan)

        val back: ImageButton = findViewById(R.id.btn_back)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}