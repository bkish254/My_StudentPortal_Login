package com.example.mystudentportal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Sign_in : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        var loginButton = findViewById<TextView>(R.id.btnLogin)
        var userName = findViewById<EditText>(R.id.inputEmail)
        var password = findViewById<EditText>(R.id.inputPassword)
        var clickTextView = findViewById<TextView>(R.id.gotoRegister)
        clickTextView.setOnClickListener {
            val intent = Intent(applicationContext, Sign_up::class.java)
            startActivity(intent)
        }
        loginButton.setOnClickListener {

            if (userName.text.toString() == "1234" && password.text.toString() == "1234") {
                val intent = Intent(applicationContext, Main22ActivitybActivity::class.java)
                startActivity(intent)
            } else {
                var toast = Toast.makeText(
                    applicationContext,
                    "username or password incorrect",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }

        }
    }

}

