package com.dam2.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cambiacolor.*


class CambiaColor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiacolor)
        val valor=intent.getStringExtra("color")
        textColor.setText(valor)

    }

}
