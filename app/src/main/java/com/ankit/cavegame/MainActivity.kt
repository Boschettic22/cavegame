package com.ankit.cavegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.buttontogo)
        //makes the portal a button to go to the cave
        button.setOnClickListener {
            val intent = Intent(this, CaveActivity::class.java)

            startActivity(intent)
        }






            }


    }










