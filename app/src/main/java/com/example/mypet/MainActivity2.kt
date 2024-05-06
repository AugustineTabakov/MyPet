package com.example.mypet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    private lateinit var welcomeButton : Button





    @SuppressLint("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val  welcomeButton = findViewById<Button>(R.id.welcomeButton)


        welcomeButton.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }
}