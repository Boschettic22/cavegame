package com.ankit.cavegame.activity

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ankit.cavegame.MyApplication
import com.ankit.cavegame.R
import java.util.*


class WinnerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.winner_activity)
        addWin()

            //define it
        val button = findViewById<ImageView>(R.id.winnerButton)
        button.setOnClickListener {
            Toast.makeText(this@WinnerActivity, "CONGRATS!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun addWin() {
        val db = (application as MyApplication).database?.writableDatabase
        val winDate = ContentValues().apply { put("win_date", Date().toString()) }
        db?.insert("win", null, winDate)
    }
}



