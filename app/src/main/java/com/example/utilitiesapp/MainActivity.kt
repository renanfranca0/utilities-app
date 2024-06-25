package com.example.utilitiesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.CalculatorActivity
import com.example.randomimages.RandomImagesActivity
import com.example.utilitiesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickListeners()
    }

    private fun clickListeners() {
        binding.calculatorButton.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        binding.randomImagesButton.setOnClickListener {
            val intent = Intent(this, RandomImagesActivity::class.java)
            startActivity(intent)
        }
    }
}