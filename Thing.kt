package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Thing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thing)
       val notify=findViewById<ImageView>(R.id.image)
        notify.setOnClickListener {
           val intent= Intent(this,Action::class.java)
            startActivity(intent)
            finish()
        }

        }
    }
