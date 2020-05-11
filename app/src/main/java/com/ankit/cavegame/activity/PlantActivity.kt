package com.ankit.cavegame.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ankit.cavegame.MyApplication
import com.ankit.cavegame.R
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
//        var winCheck: Boolean = false;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_activity)
        // get reference to button

        // importing the two variables for the winCheck

        winButton.setOnClickListener{
            if (MyApplication.Companion.grabaTorch && MyApplication.Companion.torchMancy) {
                val intent = Intent(this, WinnerActivity::class.java)
                var winCheck = true; // this is only a local variable in this listener...as soon as the listener completes, it disappears
                startActivity(intent)
            }
            else {
                //on Else send back to mainstream w a toast "u lost..."
                val intent = Intent(this, MainActivity::class.java)
                Toast.makeText(this@PlantActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

        }

    }

        //TODO Make button reset game if u fail
        //button should send u to main screen if u fail

//         if(grabaTorch && torchMancy > 0)}
//        val intent = Intent(this, WizActivity::class.java)
//
//        startActivity(intent)


    }




