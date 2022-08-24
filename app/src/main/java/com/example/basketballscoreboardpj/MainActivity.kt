package com.example.basketballscoreboardpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

private lateinit var scoreA: TextView
private lateinit var scoreB: TextView
private lateinit var resetAll: Button

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
        var timesClicked = 0

        button1A.setOnClickListener {
            timesClicked += 3
            scoreA.text = timesClicked.toString()
        }
        button2A.setOnClickListener {
            timesClicked += 2
            scoreA.text = timesClicked.toString()
        }
        button3A.setOnClickListener {
            timesClicked += 1
            scoreA.text = timesClicked.toString()
        }

    }

    //result of team B function
    private fun resultB() {
        val button1B: Button = findViewById(R.id.pt3B)
        val button2B: Button = findViewById(R.id.pt2B)
        val button3B: Button = findViewById(R.id.pt1B)
        var timesClicked = 0

        button1B.setOnClickListener {
            timesClicked += 3
            scoreB.text = timesClicked.toString()
        }
        button2B.setOnClickListener {
            timesClicked += 2
            scoreB.text = timesClicked.toString()
        }
        button3B.setOnClickListener {
            timesClicked += 1
            scoreB.text = timesClicked.toString()

        }

    }

    // reset button function
    private fun reset() {
        val resetButton: Button = findViewById(R.id.resetAll)
        val counter = 0


        resetButton.setOnClickListener {

            scoreA.text = counter.toString()
            scoreB.text = counter.toString()
            resultA()
            resultB()


        }
    }


}






