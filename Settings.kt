package com.example.smarthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val textView = findViewById<TextView>(R.id.Section)

// Set the text with a space and start from the next line
        val text = "Moses.\nkmntanda@gmail.com"
        textView.text = text

    }
}