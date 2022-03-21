package com.example.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        //val tvHello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.tvHello.text = "Teste"

    }
}