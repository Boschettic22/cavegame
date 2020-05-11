package com.ankit.cavegame.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.ankit.cavegame.MyApplication
import com.ankit.cavegame.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayCrown()

        val button = findViewById<ImageButton>(R.id.portalStart)
        //makes the portal a button to go to the cave
        button.setOnClickListener {
            val intent = Intent(this, CaveActivity::class.java)

            startActivity(intent)
        }
    }

    fun displayCrown() {
        val db = (application as MyApplication).database?.readableDatabase
        val cursor = db?.query("win", null, null, null, null, null, null)
        if (cursor?.count!! > 0) {
            val crownPic = findViewById<ImageView>(R.id.crownPicc)
            crownPic.visibility = View.VISIBLE
        }
    }

}










