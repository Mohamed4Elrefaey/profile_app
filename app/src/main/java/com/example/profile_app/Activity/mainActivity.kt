package com.example.profile_app.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profile_app.Adapter.trendsData
import com.example.profile_app.Adapter.Myadapter
import com.example.profile_app.R
import com.example.profile_app.databinding.ActivityThreeBinding


class mainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThreeBinding.inflate(layoutInflater)
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


    }
}