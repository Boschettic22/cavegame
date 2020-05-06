package com.ankit.cavegame

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.winner_activity.*


class WinnerActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.winner_activity)




            //persist the crown, how do u keep memory after restart, i want crown = true or crown = 1
//    override fun onRestart(savedInstanceState){             }


            val crownGiver = false;
            //define it
            val button = findViewById<ImageView>(R.id.winnerButton)
            winnerButton.setOnClickListener {
                Toast.makeText(this@WinnerActivity, "CONGRATS!!", Toast.LENGTH_SHORT).show()
                fun crownGiver(crown: Boolean) {
                    val crown = true

                }
            }
/////if Crown is true... Put crown on Main Screen!!

//            //makes the portal a button to go to the cave
//            button.setOnClickListener {
//                val intent = Intent(this, MainActivity::class.java)
//
//                startActivity(intent)
            }


        }



