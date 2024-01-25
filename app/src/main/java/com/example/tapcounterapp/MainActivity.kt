package com.example.tapcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAdd = findViewById<Button>(R.id.buttonCounter)
        val textCounter = findViewById<TextView>(R.id.TextCounter)
        val buttonUpgrade = findViewById<Button>(R.id.buttonUpgrade)
        var counter: Int = 0
        var increment = 1

        buttonAdd.setOnClickListener {
            counter += increment
            textCounter.text = counter.toString()

            if (counter == 100) {
                buttonUpgrade.visibility = View.VISIBLE
            }
        }

        buttonUpgrade.setOnClickListener{
            increment = 2
            buttonUpgrade.visibility = View.INVISIBLE
        }


    }
}