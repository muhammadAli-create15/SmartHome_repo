package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondLast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_last)
        val plus=findViewById<ImageView>(R.id.imagePlus)
        plus.setOnClickListener {
            val intent= Intent(this,Last::class.java)
            startActivity(intent)
            finish()
        }
    }
}