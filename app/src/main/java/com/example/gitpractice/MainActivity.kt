package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("MY SECOND COMMIT")
        println("LOCAL CHANGE")
        println("CHANGE 4")
        println("THIS LINE WILL BE MERGED")
        println("Hello from your friend")
        println("New commit")
        println("New branch1")
    }
}