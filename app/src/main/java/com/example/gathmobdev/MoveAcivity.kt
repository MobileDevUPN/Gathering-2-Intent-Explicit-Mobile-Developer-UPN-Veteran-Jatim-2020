package com.example.gathmobdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_move_acivity.*

class MoveAcivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_acivity)

        tv_back.setOnClickListener {
            val intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
        }
    }
}