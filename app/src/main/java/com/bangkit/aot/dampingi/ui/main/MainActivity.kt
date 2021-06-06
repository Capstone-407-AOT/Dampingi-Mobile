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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pelaporan: LinearLayout? = findViewById(R.id.report)
        val pendampingan: LinearLayout? = findViewById(R.id.pendampingan)
        val forum: LinearLayout? = findViewById(R.id.forum)
        val profil: LinearLayout? = findViewById(R.id.profil)
        val darurat: LinearLayout? = findViewById(R.id.darurat)
        val settings: ImageView? = findViewById(R.id.settings)


        pelaporan!!.setOnClickListener {
            val intent = Intent(this, Pelaporan::class.java)
            startActivity(intent)
        }

        forum!!.setOnClickListener {
            val intent = Intent(this, Forum::class.java)
            startActivity(intent)
        }

        pendampingan!!.setOnClickListener {
            val intent = Intent(this, Pendampingan::class.java)
            startActivity(intent)
        }

        profil!!.setOnClickListener{
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }

        darurat!!.setOnClickListener{
            val intent = Intent(this, Darurat::class.java)
            startActivity(intent)
        }


        settings!!.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }


    }

}