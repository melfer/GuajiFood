package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_coco.*
import kotlinx.android.synthetic.main.activity_main.*

class coco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coco)




        button6.setOnClickListener {
            startActivity(Intent(this, Actividaduno::class.java))
        }







    }
}