package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.Int as Int1

//Variables...
// torchMancy  ,,, grabaTorch      if torchManch && grabaTorch > 0 then move u to winscreen
/// check them both in an if( logical constraint


class PlantActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    val winButton = findViewById<Button>(R.id.winButton)
    @SuppressLint("ResourceType")
    var grabaTorch = findViewById<View>(R.layout.wiz_activity)
    @SuppressLint("ResourceType")
    var torchMancy = findViewById<View>(R.layout.cave_activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_activity)
        // get reference to button



        val grabaTorch = findViewById<Int>(R.id.button1)
        val torchMancy = findViewById<Button>(R.id.wizButton1)
        // importing the two variables for the winCheck

        winButton.setOnClickListener{
            var winCheck = false;


        winCheck(grabaTorch && torchMancy > 0){
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


    }}




