package com.example.mystudentportal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_up : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var clickcontinue = findViewById<TextView>(R.id.buttonContinue)
        clickcontinue.setOnClickListener {
            val intent = Intent(applicationContext, Sign_in::class.java)
            startActivity(intent)

        }
    }
}