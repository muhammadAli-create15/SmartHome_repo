package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Greet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val plus=findViewById<ImageView>(R.id.imageView2)
        plus.setOnClickListener {
            val intent= Intent(this,Event::class.java)
            startActivity(intent)
            finish()
        }
    }
}