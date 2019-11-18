package com.dam2.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import android.view.View
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.longToast
import org.jetbrains.anko.intentFor


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MisMensajes", "Estoy en onCreate")

        BSig.setOnClickListener{
            longToast("Error 404")
            it.snackbar("Error 404")
        }

    }

    fun cambiarMensaje(y: View){
        val formato=SimpleDateFormat("HH:mm:ss")
        val fechaActual=Calendar.getInstance().getTime()
        val string=formato.format(fechaActual)
        Hora.setText("La hora es "+string)
    }
    fun cambiarRojo(y: View){
        startActivity(intentFor<CambiaColor>("color" to "rojo"))
    }
    fun cambiarAmarillo(y: View){
        startActivity(intentFor<CambiaColor>("color" to "amarillo"))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MisMensajes","Estoy en onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MisMensajes","Mensaje de onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MisMensajes","Mensaje de onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MisMensajes","Mensaje de onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MisMensajes","Mensaje de onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MisMensajes","Mensaje de onResume")
    }



}
