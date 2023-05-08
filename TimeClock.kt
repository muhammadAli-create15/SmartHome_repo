package com.example.smarthome

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.util.Log
import android.widget.*
import java.lang.reflect.Array.set
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class TimeClock : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_clock)
        val nxt = findViewById<ImageView>(R.id.imageView3)
        val currentTime = Calendar.getInstance()
        val startHour = currentTime.get(Calendar.HOUR_OF_DAY)
        val startMinute = currentTime.get(Calendar.MINUTE)
        TimePickerDialog(
            this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

            }, startHour, startMinute, false
        ).show()

        nxt.setOnClickListener {
        val intent= Intent(this,Thing::class.java)
            startActivity(intent)
            finish()

        }
    }
}