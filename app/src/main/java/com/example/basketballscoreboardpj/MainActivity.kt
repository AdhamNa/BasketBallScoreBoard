package com.example.basketballscoreboardpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


private lateinit var scoreA: TextView
private lateinit var scoreB: TextView
private lateinit var resetAll: Button
var timesClickedA: Int = 0
var timesClickedB: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultA()
        resultB()
        reset()

        // id's of main views and button
        scoreA = findViewById(R.id.resultA)
        scoreB = findViewById(R.id.resultB)
        resetAll = findViewById(R.id.resetAll)


    }

    // result of TeamA function
    private fun resultA() {
        val button1A: Button = findViewById(R.id.pt3A)
        val button2A: Button = findViewById(R.id.pt2A)
        val button3A: Button = findViewById(R.id.pt1A)


        button1A.setOnClickListener {
            timesClickedA += 3
            scoreA.text = timesClickedA.toString()
        }
        button2A.setOnClickListener {
            timesClickedA += 2
            scoreA.text = timesClickedA.toString()
        }
        button3A.setOnClickListener {
            timesClickedA += 1
            scoreA.text = timesClickedA.toString()
        }

    }

    //result of team B function
    private fun resultB() {
        val button1B: Button = findViewById(R.id.pt3B)
        val button2B: Button = findViewById(R.id.pt2B)
        val button3B: Button = findViewById(R.id.pt1B)


        button1B.setOnClickListener {
            timesClickedB += 3
            scoreB.text = timesClickedB.toString()
        }
        button2B.setOnClickListener {
            timesClickedB += 2
            scoreB.text = timesClickedB.toString()
        }
        button3B.setOnClickListener {
            timesClickedB += 1
            scoreB.text = timesClickedB.toString()

        }

    }

    // reset button function
    private fun reset() {
        val resetButton: Button = findViewById(R.id.resetAll)
        resetButton.setOnClickListener {

            timesClickedA = 0
            timesClickedB = 0
            scoreA.text = "0"
            scoreB.text = "0"


        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Team A Score", timesClickedA)
        outState.putInt("Team B Score", timesClickedB)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        timesClickedA = savedInstanceState.getInt("Team A Score")
        timesClickedB = savedInstanceState.getInt("Team B Score")
        scoreA.text = timesClickedA.toString()
        scoreB.text = timesClickedB.toString()

    }


}






