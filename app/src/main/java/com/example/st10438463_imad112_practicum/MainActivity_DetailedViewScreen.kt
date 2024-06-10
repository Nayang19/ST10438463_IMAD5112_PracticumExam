package com.example.st10438463_imad112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_DetailedViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_detailed_view_screen)

    //Declare your buttons
        val returnButton = findViewById<Button>(R.id.returnButton)
        returnButton?.setOnClickListener {
            val intent = Intent(this,MainActivity_SecondPage::class.java)
            startActivity(intent)
        }
    }
}