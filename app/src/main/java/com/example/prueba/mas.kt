package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estadisticas.*
import kotlinx.android.synthetic.main.activity_mas.*

class mas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mas)

        button14.setOnClickListener {
            startActivity(Intent(this, Actividaduno::class.java))

        }
    }
}