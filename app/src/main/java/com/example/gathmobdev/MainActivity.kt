package com.example.gathmobdev

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_intentImplisit.setOnClickListener(this)
        btn_intentexplicit.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.tv_intentImplisit -> {
                val link = "//instagram.com/mlniasyfrda?igshid=2qttk0rd499q"
                val IntentImplisit = Intent(Intent.ACTION_VIEW, Uri.parse("http:$link"))
                startActivity(IntentImplisit)
            }

            R.id.btn_intentexplicit -> {
                val intentExplicit = Intent(this, MoveAcivity::class.java)
                startActivity(intentExplicit)
            }

        }
    }
}