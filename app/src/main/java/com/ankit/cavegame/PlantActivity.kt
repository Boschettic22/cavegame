package com.ankit.cavegame

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Variables...
// torchMancy  ,,, grabaTorch      if torchManch && grabaTorch > 0 then move u to winscreen
/// check them both in an if( logical constraint


class PlantActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_activity)
        // get reference to button
        val winButton = findViewById<Button>(R.id.winButton)
        val grabaTorch = findViewById<Button>(R.id.caveButton1)
        val torchMancy: = findViewById<Button>(R.id.wizButton1)
        // importing the two variables for the winCheck

        winButton.setOnClickListener{
        var winCheck = false;
        //setting this if these are both above 1 than set the win to true
        fun winCheck(grabaTorch && torchMancy > 0){
            val winCheck = true;
            setContentView(R.layout.winner_activity
        }
        }

//         if(grabaTorch && torchMancy > 0)}
//        val intent = Intent(this, WizActivity::class.java)
//
//        startActivity(intent)


    }}




