package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//i want this code to put away some text when one of the buttons is pressed, and
//if the user chooses correctly, gives them a torch,
//and progress their text or maybe change their screen (add later, wiz part)
//when torchhaver is selected I'll have a counter go up One and if that's > 1 and another criteria is met
//you win the game
//not very fun but 'gameplay' comes later :p

class CaveActivity : AppCompatActivity() {
    var grabaTorch: Int = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        //declaring global var and specifying, later itll be counted
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cave_activity)

        val textView = findViewById<TextView>(R.id.dungeontext)
        val button1: Button = findViewById<Button>(R.id.button1);
        val button2 = findViewById<Button>(R.id.button2);
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);

//TODO Make button 4 take u to next activity so player can fail

        // Counter to count button click


//counter Grabatorch

        //del 40 if stuff doesnt work i just added
        button1.setOnClickListener() {
            data class Counter(val grabaTorch: Int) {
                operator fun plus(increment: Int): Counter {
                    return Counter(grabaTorch + increment)


                }
            }

        }

//        to avoid unfun crashes. (As opposed to fun crashes)
            button1.setOnClickListener {
            Toast.makeText(this@CaveActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()      }

            button2.setOnClickListener {
            Toast.makeText(this@CaveActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()       }

//        to go to wiz, and skip.  btm right button
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            Toast.makeText(this@CaveActivity, "You Grab a Torch!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, WizActivity::class.java)
            startActivity(intent)
        }
    }


}




