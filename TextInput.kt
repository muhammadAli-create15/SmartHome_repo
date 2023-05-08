package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class TextInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input)
val validate=findViewById<TextView>(R.id.edOk)

        validate.setOnClickListener {
            val intent= Intent(this,Active::class.java)
            startActivity(intent)
            finish()
        }

    }
}