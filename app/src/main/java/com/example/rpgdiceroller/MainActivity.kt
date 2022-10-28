package com.example.rpgdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // create MainActivity variables
    private lateinit var modifierInput : EditText
    private lateinit var rollOutput : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // OnCreate variables
        val d20Button = findViewById<Button>(R.id.d20_button)
        val d12Button = findViewById<Button>(R.id.d12_button)
        val d10Button = findViewById<Button>(R.id.d10_button)
        val d100Button = findViewById<Button>(R.id.d100_button)
        val d8Button = findViewById<Button>(R.id.d8_button)
        val d6Button = findViewById<Button>(R.id.d6_button)
        val d4Button = findViewById<Button>(R.id.d4_button)
        val d2Button = findViewById<Button>(R.id.d2_button)

        // call function "roll_dice" on button press
        // each button passes in its own size when pressed
        d20Button.setOnClickListener { rollDice(20) }
        d12Button.setOnClickListener { rollDice(12) }
        d10Button.setOnClickListener { rollDice(10) }
        d100Button.setOnClickListener { rollDice(100) }
        d8Button.setOnClickListener { rollDice(8) }
        d6Button.setOnClickListener { rollDice(6) }
        d4Button.setOnClickListener { rollDice(4) }
        d2Button.setOnClickListener { rollDice(2) }

        // initialize MainActivity variables
        modifierInput = findViewById<EditText>(R.id.modifier_input)
        rollOutput = findViewById<TextView>(R.id.roll_output)
        /* findViewById can only be used after the function onCreate,
        * which is why these variables had to be initialized here
        * instead of upon creation */
    }

    private fun rollDice(dice_size : Int) {
        try {
            // convert modifier to int
            val modifier = modifierInput.text.toString().toInt()

            // generate a random number between 1 and the given dice size and add the modifier
            val numberRolled = (1..dice_size).random() + modifier

            // change the text of TextView rollOutput to the number rolled
            rollOutput.text = "$numberRolled"
        } catch (e: Exception) { // if any exceptions occur
            // create popup to inform user of invalid input
            Toast.makeText(this, "Invalid Modifier!", Toast.LENGTH_LONG).show()
        }
    }
}