package com.bangkit.aot.dampingi.ui.fitur.forum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import com.bangkit.aot.dampingi.R
import com.bangkit.aot.dampingi.ui.fitur.forum.dataForum.DataForum
import com.bangkit.aot.dampingi.ui.fitur.forum.dataForum.DataSubyek
import com.bangkit.aot.dampingi.ui.main.MainActivity

class Forum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        val back: ImageButton? = findViewById(R.id.btn_back)
        val forum1: LinearLayout? = findViewById(R.id.forum2)
        val forum2: LinearLayout? = findViewById(R.id.forum1)

        back!!.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        forum1!!.setOnClickListener{
            val intent = Intent(this, ChatForum::class.java)
            startActivity(intent)

        }

        forum2!!.setOnClickListener{
            val intent = Intent(this, ChatForum::class.java)
            startActivity(intent)

        }



        val forumList = listOf<DataForum>(
            DataForum(
                "Kesehatan Mental"
            ),
            DataForum(
                "Kesehatan Mental"
            ),
            DataForum(
                "Kesehatan Mental"
            ),
        )

        val subyekList = listOf<DataSubyek>(
            DataSubyek(
                R.drawable.send_icon,
                "Menghadapi Trauma",
                "User143",
                "Saya juga pernah tidak pernah..",
            ),
            DataSubyek(
                R.drawable.send_icon,
                "Menghadapi Trauma",
                "User123",
                "Saya juga pernah tidak pernah..",
            ),
            DataSubyek(
                R.drawable.send_icon,
                "Menghadapi Trauma",
                "User153",
                "Saya juga pernah tidak pernah..",
            ),
        )
    }
}