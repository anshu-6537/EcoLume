package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val logi: Button = findViewById(R.id.login)
        logi.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
    }
}