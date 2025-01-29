package com.example.profile_app.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profile_app.Adapter.trendsData
import com.example.profile_app.Adapter.Myadapter
import com.example.profile_app.R
import com.example.profile_app.databinding.ActivitySecondBinding



class secondActivity : AppCompatActivity() {

    lateinit var  binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        var datalist = mutableListOf(
            trendsData( "Future in Al, What will tomorrow be like?", "Robot",R.drawable.trends),
            trendsData( "Future in Al, What will tomorrow be like?", "Robot",R.drawable.trends2),
            trendsData( "Future in Al, What will tomorrow be like?", "Robot",R.drawable.trends),
            trendsData( "Future in Al, What will tomorrow be like?", "Robot",R.drawable.trends2),
            trendsData( "Future in Al, What will tomorrow be like?", "Robot",R.drawable.trends)
        )


        var adapter = Myadapter(datalist)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)


        binding.profileBtn.setOnClickListener(){
            var intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }

    }
}