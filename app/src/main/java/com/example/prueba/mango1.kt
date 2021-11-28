package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageButton9
import kotlinx.android.synthetic.main.activity_mango1.*

class mango1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mango1)

        button5.setOnClickListener {
            startActivity(Intent(this, Actividaduno::class.java))
        }
    }
}