package com.ankit.cavegame

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        val button = findViewById<ImageButton>(R.id.portalStart)
        //makes the portal a button to go to the cave
        button.setOnClickListener {
            val intent = Intent(this, CaveActivity::class.java)

            startActivity(intent)
        }


            }


    }










