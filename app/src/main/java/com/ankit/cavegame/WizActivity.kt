package com.ankit.cavegame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.wiz_activity.*


//push wizButton1, get +1 pyromancy, change screen to final boss
//value must be carried to final boss in order to beat him

class WizActivity : AppCompatActivity() {
    var torchMancy = 0;
    @SuppressLint("SetTextI18n", "WrongViewCast")

    override fun onCreate(savedInstanceState: Bundle?) {
       //ww
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wiz_activity)

        val TextView = findViewById<TextView>(R.id.wizButton1)
        val wizButton1 = findViewById<Button>(R.id.wizActivity)
        var torchMancyCounter: Int = 0;



        val button2 = findViewById<Button>(R.id.wizButton2);
        val button3 = findViewById<Button>(R.id.wizButton3);


        data class Counter(val torchMancy: Int) {
            operator fun plus(increment: Int): Counter {
                return Counter(torchMancy + increment)
            }
        }

        var torchMancy = 0;
        wizButton1.setOnClickListener(){
                torchMancy++
//TODO Fix this variable / code maybe check how caveActivity did it
                android.widget.TextView.torchMancy = "Torch Counter : $torchMancy"

                val button = findViewById<Button>(R.id.wizButton1)
                //makes the portal a button to go to the cave
                button.setOnClickListener {
                    val intent = Intent(this, PlantActivity::class.java)

                    startActivity(intent)
                }
//TODO Make the button after TorchMancy send you to thenext Intent and test app

        }

//for fun
        wizButton3.setOnClickListener {
            Toast.makeText(this@WizActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

            wizButton4.setOnClickListener {
                Toast.makeText(this@WizActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

        val button = findViewById<Button>(R.id.wizButton4)
        //makes the portal a button to go to the cave
        button.setOnClickListener {
            val intent = Intent(this, PlantActivity::class.java)

            startActivity(intent)

        }}}




