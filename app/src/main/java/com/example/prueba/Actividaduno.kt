package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estadisticas.*
import kotlinx.android.synthetic.main.activity_main.*

class Actividaduno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        hbo.setOnClickListener {
            startActivity(Intent(this, Actividaddos::class.java))

        }
        hbo3.setOnClickListener {
            startActivity(Intent(this, coco::class.java))
        }

        hbo1.setOnClickListener {
            startActivity(Intent(this, guineo::class.java))
        }


        imageButton11.setOnClickListener {
            startActivity(Intent(this, melon::class.java))
        }

        imageButton12.setOnClickListener {
            startActivity(Intent(this, papaya::class.java))
        }
        imageView2.setOnClickListener {
            startActivity(Intent(this, patilla::class.java))
        }
        imageView5.setOnClickListener {
            startActivity(Intent(this, yuca::class.java))
        }
        imageView4.setOnClickListener {
            startActivity(Intent(this, platano::class.java))
        }

        imageButton9.setOnClickListener {
            startActivity(Intent(this, mango1::class.java))
        }
        button11.setOnClickListener {
            startActivity(Intent(this, estadisticas::class.java))
        }

        button12.setOnClickListener {
            startActivity(Intent(this, mas::class.java))
        }


    }

}
