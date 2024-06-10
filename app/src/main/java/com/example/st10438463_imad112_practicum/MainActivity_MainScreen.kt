package com.example.st10438463_imad112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



@Suppress("NAME_SHADOWING")
class MainActivity_SecondPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_second_page)
    //Declare your button
        val exitButton = findViewById<Button>(R.id.exitButton)
    //Create a code that will take you to the previous screen from this current screen
        exitButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
    //Create a code for your button that will take you from the current screen to the next
        nextButton?.setOnClickListener {
               val intent = Intent(this,MainActivity_DetailedViewScreen::class.java)
            startActivity(intent)
        }
    //Declare your arrays
        val daysArray = arrayListOf<String>("Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday")
        val minTemperatureArray = arrayListOf("12","15","9","8","12","10","10")
        val maxTemperatureArray = arrayListOf("25","29","18","11","15","18","16")

        //get the days of the week text view
        val daysTextView = findViewById<TextView>(R.id.daysTextView)
        //set the text views text to the first day of the week
        daysTextView.text = intArrayOf(0).toString()

        val day = daysArray
        day[0] = "Monday"
        day[1] = "Tuesday"
        day[2] = "Wednesday"
        day[3] = "Thursday"
        day[4] = "Friday"
        day[5] = "Saturday"
        day[6] = "Sunday"

        val minTemp = minTemperatureArray
        day[0] = "12"
        day[1] = "15"
        day[2] = "9"
        day[3] = "8"
        day[4] = "12"
        day[5] = "10"
        day[6] = "10"

        val maxTemp = maxTemperatureArray
        day[0] = "25"
        day[1] = "29"
        day[2] = "18"
        day[3] = "11"
        day[4] = "15"
        day[5] = "18"
        day[6] = "16"

        var daysDisplay = ""
        daysTextView.text = daysDisplay

        daysDisplay += "${day[0]}/n"
        daysDisplay += "${day[1]}/n"
        daysDisplay += "${day[2]}/n"
        daysDisplay += "${day[3]}/n"
        daysDisplay += "${day[4]}/n"
        daysDisplay += "${day[5]}/n"
        daysDisplay += "${day[6]}/n"

        //add all the days to the display string
        var counter = 0
         while (counter < 6) {
           daysDisplay += "${day[counter]}/n"
             counter++
         }
    //Calculate the average of the minimum and maximum temperature this week
        var averageOfMinTemperature = minTemperatureArray
           12 + 15 + 9 + 8 + 12 + 10 + 10
            76 / 7
        10.85.also { averageOfMinTemperature = minTemperatureArray }

        var averageOfMaxTemperature = maxTemperatureArray
           25 + 29 + 18 + 11 + 15 + 10 + 10
            118 / 7
        16.85.also { averageOfMaxTemperature = maxTemperatureArray }


        for (
        counter in 0 to 6)
            averageOfMaxTemperature = averageOfMaxTemperature / 6



        }
    }

private operator fun <E> ArrayList<E>.div(i: Int): ArrayList<E> {}




