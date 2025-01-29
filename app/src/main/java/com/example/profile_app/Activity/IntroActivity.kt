package com.example.profile_app.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.profile_app.databinding.IntroActivityMainBinding

class IntroActivity : AppCompatActivity() {

    lateinit var binding: IntroActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = IntroActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.getStart.setOnClickListener(){
            val intentTo =  Intent(this, secondActivity::class.java)
            startActivity(intentTo)
        }
    }
}