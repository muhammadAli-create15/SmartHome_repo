package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RoutineClock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routine_clock)

        val image=findViewById<ImageView>(R.id.imageView3)
        image.setOnClickListener {
            val intent= Intent(this,Thing::class.java)
            startActivity(intent)
            finish()
        }
    }
}