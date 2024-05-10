package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome1)

        val button:Button=findViewById(R.id.start)
        button.setOnClickListener {
            val intent = Intent(this, Welcome2::class.java)
            startActivity(intent)
        }
    }
}