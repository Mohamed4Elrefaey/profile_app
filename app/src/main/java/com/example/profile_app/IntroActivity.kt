package com.example.profile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class IntroActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.intro_activity_main)

        var start = findViewById<AppCompatButton>(R.id.get_start)

        start.setOnClickListener(){
            val intentTo =  Intent(this, profileActivity::class.java)
            startActivity(intentTo)
        }
    }
}