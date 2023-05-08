package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class Event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        val linear=findViewById<LinearLayout>(R.id.myLinearLayout)
        linear.setOnClickListener {
            val intent= Intent(this,TimeClock::class.java)
            startActivity(intent)
            finish()
        }
    }
}