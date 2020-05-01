package com.ankit.cavegame


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//i want this code to put away some text when one of the buttons is pressed, and
//if the user chooses correctly, gives them a torch,
//and progress their text or maybe change their screen (add later, wiz part)
//when torchhaver is selected I'll have a counter go up One and if that's > 1 and another criteria is met
//you win the game
//not very fun but 'gameplay' comes later :p


class CaveActivity() : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cave_activity)

        val textView = findViewById<TextView>(R.id.text_view_torch)
        val button1 = findViewById<Button>(R.id.button1);
        val button2 = findViewById<Button>(R.id.button2);
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);

        // Counter to count button click
        var torchCounter: Int = 0;


        button1.setOnClickListener(){
            torchCounter++
            textView.text = "Torch Counter : $torchCounter"
        }
//    fun grabaTorch(view : View){
//        //do something when torch is grabbed
//        var torch: Int = 0
//


    }

    data class Counter(val grabaTorch: Int) {
        operator fun plus(increment: Int): Counter {
            return Counter(grabaTorch + increment)
        }
    }


}




