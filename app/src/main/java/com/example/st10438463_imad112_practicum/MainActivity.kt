package com.example.st10438463_imad112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    //Declare the button
        val getStartedButton = findViewById<Button>(R.id.getStartedButton)
    //Create a code for your button that will take you to the next screen once clicked
        getStartedButton?.setOnClickListener {
            val intent = Intent (this, MainActivity_SecondPage::class.java)
            startActivity(intent)
        }
        }
    }
