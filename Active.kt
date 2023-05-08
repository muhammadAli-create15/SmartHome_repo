package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Active : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.edtFavorites -> {
                    // Handle Home click
                    val intent = Intent(this, SecondLast::class.java)
                    startActivity(intent)
                    true
                }
                R.id.edtTINGS -> {
                    // Handle Dashboard click
                    true
                }
                R.id.edtRoutines -> {
                    // Handle Notifications click
                    true
                }
                R.id.edtIdeas -> {
                    true

                }
                R.id.edtSettings -> {
                    true
                }
                else -> false
            }
        }
    }
}