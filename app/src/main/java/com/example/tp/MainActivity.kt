package com.example.tp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var boutonChanger : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boutonChanger = findViewById(R.id.btn_tp1)

        val intentRedirect : Intent = Intent(this, RecyclerViewActivity::class.java);

        boutonChanger.setOnClickListener{
            startActivity(intentRedirect)
        }
    }




}