package com.example.mypet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
// Declaration of Button.
    
    private lateinit var welcomeButton : Button





    @SuppressLint("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

// Enabling the welcomeButton to take the Introduction screen to the 2nd screen with the attributes displaying the condition
of the cat.
        
        val  welcomeButton = findViewById<Button>(R.id.welcomeButton)


        welcomeButton.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }
}
