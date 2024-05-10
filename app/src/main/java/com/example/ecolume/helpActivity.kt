package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class helpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val back:ImageButton=findViewById(R.id.back)
        back.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }
    }
}