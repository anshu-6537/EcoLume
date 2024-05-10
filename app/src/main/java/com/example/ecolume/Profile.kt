package com.example.ecolume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val edit:ImageView=findViewById(R.id.edit)
        val acc:TextView=findViewById(R.id.account)
        val beneficiary:TextView=findViewById(R.id.beneficiary)
        val logout:TextView=findViewById(R.id.logout)
        val help:TextView=findViewById(R.id.help)
        val about:TextView=findViewById(R.id.about)

        edit.setOnClickListener {
            Toast.makeText(this,"Contact Admin..",Toast.LENGTH_SHORT).show()
        }
        acc.setOnClickListener {
            Toast.makeText(this,"...Later...",Toast.LENGTH_SHORT).show()
        }
        beneficiary.setOnClickListener {
            Toast.makeText(this,"..Beneficiary..",Toast.LENGTH_SHORT).show()
        }
        logout.setOnClickListener {

        }
        help.setOnClickListener {
            startActivity(Intent(this,helpActivity::class.java))
        }
        about.setOnClickListener {
            startActivity(Intent(this,aboutActivity::class.java))
        }

    }
}