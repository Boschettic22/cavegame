package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.plant_activity.*

//Variables...
// torchMancy  ,,, grabaTorch      if torchManch && grabaTorch > 0 then move u to winscreen
/// check them both in an if( logical constraint


class PlantActivity : AppCompatActivity() {
// i want winCheck to enable a crown @ the start of the game on the main menu
    //if u get = true u get a crown
    var winCheck = false;


    @SuppressLint("SetTextI18n")
//    val winButton = findViewById<Button>(R.id.winButton)
//    @SuppressLint("ResourceType")
//    var grabaTorch = findViewById<View>(R.layout.wiz_activity)
//    @SuppressLint("ResourceType")
//    var torchMancy = findViewById<View>(R.layout.cave_activity)


    override fun onCreate(savedInstanceState: Bundle?) {
        var winCheck: Boolean = false;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_activity)
        // get reference to button

//        var grabaTorch: Int = 0    <-- example
//    @SuppressLint("ResourceType")
//    var grabaTorch = findViewById<View>(R.layout.wiz_activity)
//    @SuppressLint("ResourceType")
//    var torchMancy = findViewById<View>(R.layout.cave_activity)

//        comented out @ 10:30
        @SuppressLint("ResourceType")
        var grabaTorch =  findViewById<Button>(R.integer.grabaTorch)
        @SuppressLint("ResourceType")
        var torchMancy: Button? = findViewById<Button>(R.integer.torchMancy)
        // importing the two variables for the winCheck

        winButton.setOnClickListener{
            fun main if (grabaTorch > 0) {
            val intent = Intent(this, MainActivity::class.java)
            //we go to a new activity too
            startActivity(intent)

            var winCheck = true;
        else {
                //on Else send back to mainstream w a toast "u lost..."
                val intent =
                    android.content.Intent(this, com.ankit.cavegame.MainActivity::class.java)
                Toast.makeText(this@PlantActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()      }


                startActivity(intent)




        }
            }

            val intent = Intent(this, MainActivity::class.java)
            //we go to a new activity too
            startActivity(intent)

            var winCheck = true;
            setContentView(R.layout.winner_activity)
        }

        }

        //TODO Make button reset game if u fail
        //button should send u to main screen if u fail

//         if(grabaTorch && torchMancy > 0)}
//        val intent = Intent(this, WizActivity::class.java)
//
//        startActivity(intent)


    }




