package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener{
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

        binding?.flBMI?.setOnClickListener{
            val intent = Intent(this,BmiActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}