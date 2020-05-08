package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Variables...
// torchMancy  ,,, grabaTorch      if torchManch && grabaTorch > 0 then move u to winscreen
/// check them both in an if( logical constraint


class PlantActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    val winButton = findViewById<Button>(R.id.winButton)
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
        var torchMancy: Int = findViewById<Button>(R.integer.torchMancy)
        // importing the two variables for the winCheck

        winButton.setOnClickListener{
            fun main = if(grabaTorch > 0) {
                ( torchMancy > 0 )
                    else{

                }
            }
            }

            val intent = Intent(this, WizActivity::class.java)
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




