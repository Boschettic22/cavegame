package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//push wizButton1, get +1 pyromancy, change screen to final boss
//value must be carried to final boss in order to beat him

class WizActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wiz_activity)

        val textView = findViewById<TextView>(R.id.wizButton1)
        val wizButton1 = findViewById<Button>(R.id.wizActivity)
        var torchMancyCounter: Int = 0;



        data class Counter(val torchMancyCounter: Int) {
            operator fun plus(increment: Int): Counter {
                return Counter(torchMancyCounter + increment)
            }
        }


        wizButton1.setOnClickListener(){
                torchMancyCounter++

                textView.text = "Torch Counter : $torchMancyCounter"

                val button = findViewById<Button>(R.id.wizButton1)
                //makes the portal a button to go to the cave
                button.setOnClickListener {
                    val intent = Intent(this, PlantActivity::class.java)

                    startActivity(intent)
                }


        }




        }}




