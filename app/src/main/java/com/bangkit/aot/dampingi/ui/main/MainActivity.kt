package com.bangkit.aot.dampingi.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.ui.fitur.darurat.Darurat
import com.bangkit.aot.dampingi.ui.fitur.forum.Forum
import com.bangkit.aot.dampingi.ui.fitur.pelaporan.Pelaporan
import com.bangkit.aot.dampingi.ui.fitur.pendampingan.Pendampingan
import com.bangkit.aot.dampingi.ui.fitur.peta.Peta

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pelaporan: LinearLayout = findViewById(R.id.pelaporan)
        val forum: LinearLayout = findViewById(R.id.forum)
        val pendampingan: LinearLayout = findViewById(R.id.pendampingan)
        val peta: LinearLayout = findViewById(R.id.peta)
        val darurat: ImageView = findViewById(R.id.btn_panic)
        val profil: ImageView = findViewById(R.id.profil)
        val setting: ImageView = findViewById(R.id.setting)



        pelaporan.setOnClickListener {
            val intent = Intent(this, Pelaporan::class.java)
            startActivity(intent)
        }

        forum.setOnClickListener {
            val intent = Intent(this, Forum::class.java)
            startActivity(intent)
        }

        pendampingan.setOnClickListener {
            val intent = Intent(this, Pendampingan::class.java)
            startActivity(intent)
        }

        peta.setOnClickListener {
            val intent = Intent(this, Peta::class.java)
            startActivity(intent)
        }

        darurat.setOnClickListener {
            val intent = Intent(this, Darurat::class.java)
            startActivity(intent)
        }

        profil.setOnClickListener{
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }

        setting.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }

    }
}