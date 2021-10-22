package com.example.uts_72190338

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Service : AppCompatActivity() {
    lateinit var btnGetAPI: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnGetAPI = findViewById(R.id.btnGetAPI)

        btnGetAPI.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@Service, MainActivity::class.java)
            startActivity(intent)
        })
    }
}