package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)

        val button: Button =findViewById(R.id.next)
        button.setOnClickListener {
            val intent = Intent(this, Welcome3::class.java)
            startActivity(intent)
        }
    }
}