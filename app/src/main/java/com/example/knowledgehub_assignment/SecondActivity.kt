package com.example.knowledgehub_assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnContanct = findViewById<Button>(R.id.button2)

        //defining variables for cardviews

        val webClick = findViewById<TextView>(R.id.web)
        val androidClick = findViewById<TextView>(R.id.android)
        val aiClick = findViewById<TextView>(R.id.ai)
        val blockchainClick = findViewById<TextView>(R.id.blockchain)
        val bigdataClick = findViewById<TextView>(R.id.bigdata)
        val javaClick = findViewById<TextView>(R.id.java)


        btnContanct.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "1122334455"))
            startActivity(intent)
        }

        webClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/web-development/")
            startActivity(intent)
        }

        androidClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/docs")
            startActivity(intent)
        }

        aiClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/artificial-intelligence-an-introduction/")
            startActivity(intent)
        }

        blockchainClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.simplilearn.com/tutorials/blockchain-tutorial/how-to-become-a-blockchain-developer")
            startActivity(intent)
        }

        bigdataClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/what-is-big-data/")
            startActivity(intent)
        }

        javaClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/java/")
            startActivity(intent)
        }
    }
}