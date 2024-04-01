package com.example.wsrconnect

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        var button = findViewById<ImageButton>(R.id.ConnectButton)
        button.setOnClickListener {
            startActivity(Intent(this, SignInScreen::class.java))
        }
    }
}