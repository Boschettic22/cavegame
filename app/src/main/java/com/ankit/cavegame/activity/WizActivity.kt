package com.ankit.cavegame.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ankit.cavegame.MyApplication
import com.ankit.cavegame.R
import kotlinx.android.synthetic.main.wiz_activity.*


//push wizButton1, get +1 pyromancy, change screen to final boss
//value must be carried to final boss in order to beat him

class WizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //ww
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wiz_activity)

        val wizButton1 = findViewById<Button>(R.id.wizButton1)

        val button2 = findViewById<Button>(R.id.wizButton2);
        val button3 = findViewById<Button>(R.id.wizButton3);

        wizButton1.setOnClickListener() {
            Toast.makeText(this@WizActivity, "TORCHED MOFO!", Toast.LENGTH_SHORT).show()
            MyApplication.Companion.torchMancy = true;

//TODO Fix this variable / code maybe check how caveActivity did it
//            Code Locked away until it plays nicely.

//                android.widget.TextView.torchMancy = "Torch Counter : $torchMancy"
//
//                val button = findViewById<Button>(R.id.wizButton1)
//                //makes the portal a button to go to the cave
//                button.setOnClickListener {
//                    val intent = Intent(this, PlantActivity::class.java)
//
//                    startActivity(intent)
//                }

        }

//for fun
        wizButton3.setOnClickListener {
            Toast.makeText(this@WizActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()
        }

        wizButton4.setOnClickListener {
            Toast.makeText(this@WizActivity, "You Probably Died...", Toast.LENGTH_SHORT).show()

            val button = findViewById<Button>(R.id.wizButton4)
            //makes the portal a button to go to the cave
            button.setOnClickListener {
                val intent = Intent(this, PlantActivity::class.java)

                startActivity(intent)
            }


        }

    }
}




