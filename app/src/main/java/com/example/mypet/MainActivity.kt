package com.example.mypet

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mypet.R.id.buttonPlay

class MainActivity : AppCompatActivity() {
//Declaration of Buttons and Image.
    private lateinit var buttonPlay: Button
    private lateinit var buttonFood: Button
    private lateinit var buttonGroom: Button
    private lateinit var imageCat: ImageView

//Values assigned to attributes describing the pet's condition. 
    private var hunger = 100
    private var clean = 100
    private var happy = 100


    @SuppressLint("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imageCat = findViewById(R.id.imageCat)

        // buttons

        val ButtonPlay = findViewById<Button>(R.id.buttonPlay)
        val ButtonFood = findViewById<Button>(R.id.buttonFood)
        val ButtonGroom = findViewById<Button>(R.id.buttonGroom)

//If statements to assign the required values depending on the attributes value when added or subtracted.
        fun feedCat() {

            hunger += 10
            if (hunger > 100) hunger = 100
            happy += 5
            clean -= 5


        }

        fun groomCat() {
            clean = 100
            happy -= 5
            if (happy < 0) happy = 0


        }

        fun playCat() {

            happy -= 10
            if (happy > 100) happy = 100
            hunger -= 10
            if (hunger > 100) hunger = 100
            clean -= 5
            if (clean < 0) clean = 0

        }
        updateUI()

        /* The click of each attribute on the buttons they have been assigned to is to display the correct image 
        in order to meet the name of the button  */

        
        buttonPlay.setOnClickListener {
            playCat()
            updateUI()
            imageCat.setImageResource(R.drawable.play)


        }
        buttonFood.setOnClickListener {
            feedCat()
            updateUI()
            imageCat.setImageResource(R.drawable.feed)

        }
        buttonGroom.setOnClickListener {
            groomCat()
            updateUI()
            imageCat.setImageResource(R.drawable.groom)


        }


    }
// To intialize the textViews to meet their values.

    private fun updateUI() {
        val textViewHappy = findViewById<TextView>(R.id.textViewHappy)
        val textViewHunger = findViewById<TextView>(R.id.textViewHunger)
        val textViewClean = findViewById<TextView>(R.id.textViewClean)

        textViewHappy.text = "Happy: $happy"
        textViewHunger.text = "Hunger : $hunger"
        textViewClean.text = "Clean: $clean"

    }
}
