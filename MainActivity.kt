package com.example.smarthome


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        var add=findViewById<ImageView>(R.id.image1)

        add.setOnClickListener {
            val intent= Intent(this,Add::class.java)
            startActivity(intent)
            finish()
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.edtFavorites -> {
                    // Handle Home click
                    val intent=Intent(this,Routine::class.java)
                    startActivity(intent)
                    true
                }
                R.id.edtTINGS -> {
                    // Handle Dashboard click
                    true
                }
                R.id.edtRoutines -> {
                    // Handle Notifications click
                    val intent=Intent(this,Routine::class.java)
                    startActivity(intent)
                    true
                }
                R.id.edtIdeas ->{
                    val intent=Intent(this,Ideas::class.java)
                    startActivity(intent)
                    true

                }
                R.id.edtSettings ->{
                    val intent=Intent(this,Settings::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }


    }
}