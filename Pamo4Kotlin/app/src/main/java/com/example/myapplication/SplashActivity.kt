package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed({
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }, 3000)
    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }
}