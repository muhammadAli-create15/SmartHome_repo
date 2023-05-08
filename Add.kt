package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val add=findViewById<ImageView>(R.id.edtAdd)
        add.setOnClickListener {
            val intent= Intent(this,CreateRoutine::class.java)
            startActivity(intent)
            finish()
        }
    }
}