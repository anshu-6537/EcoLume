package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val profile:ImageButton=findViewById(R.id.profile)


        profile.setOnClickListener {
            Toast.makeText(this,"profile",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Profile::class.java))
        }
    }

}