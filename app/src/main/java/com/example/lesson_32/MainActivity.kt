package com.example.lesson_32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//MVP

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FirstFragment())
            .commit()
    }
}