package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class CreateRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routine)
        var addEvent=findViewById<EditText>(R.id.editTextTextPersonName)
        val message = addEvent.text.toString()

       /* val intent = Intent(this, Greet::class.java).apply {
            putExtra("EXTRA_MESSAGE", message)
        }
        startActivity(intent)

        */
        addEvent.setOnClickListener {
            val intent= Intent(this,Greet::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
