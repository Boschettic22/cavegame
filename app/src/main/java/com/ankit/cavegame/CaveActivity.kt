package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//i want this code to put away some text when one of the buttons is pressed, and
//if the user chooses correctly, gives them a torch,
//and progress their text or maybe change their screen (add later, wiz part)
//when torchhaver is selected I'll have a counter go up One and if that's > 1 and another criteria is met
//you win the game
//not very fun but 'gameplay' comes later :p

class CaveActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        //declaring global var and specifying, later itll be counted
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cave_activity)

//        val textView = findViewById<TextView>(R.id.dungeontext)
        val button1: Button = findViewById<Button>(R.id.button1);
        val button2 = findViewById<Button>(R.id.button2);
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);
// p sure button 4 is in use @ bottom but i gotta coment out to get stuff to work
//TODO Make button 4 take u to next activity so player can fail

        // Counter to count button click


//counter Grabatorch

        //del 40 if stuff doesnt work i just added
        button1.setOnClickListener() {
            Toast.makeText(this@CaveActivity, "You grabbed a torch!", Toast.LENGTH_SHORT).show()
            MyApplication.Companion.grabaTorch = true;
        }

//        to avoid unfun crashes. (As opposed to fun crashes)
        button3.setOnClickListener {
        Toast.makeText(this@CaveActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()      }

        button2.setOnClickListener {
        Toast.makeText(this@CaveActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()       }

//        to go to wiz, and skip.  btm right button
        button4.setOnClickListener {
            Toast.makeText(this@CaveActivity, "Go to the light!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, WizActivity::class.java)
            startActivity(intent)
        }
    }


}




