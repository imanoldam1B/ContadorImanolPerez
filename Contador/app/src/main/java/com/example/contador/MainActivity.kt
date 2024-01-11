package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonRestar : Button = findViewById(R.id.botonDecrementar)
        val botonSumar : Button = findViewById(R.id.botonIncrementar)
        val botonReset : ImageButton = findViewById(R.id.botonReiniciar)
        val contadorSalida : TextView = findViewById(R.id.contador)

        botonSumar.setOnClickListener {
            var laSalida = contadorSalida.text.toString().toInt()
            laSalida++
            contadorSalida.text = laSalida.toString()
        }

        botonRestar.setOnClickListener {
            var laSalida = contadorSalida.text.toString().toInt()

            if (laSalida > 0) {
                laSalida--
                contadorSalida.text = laSalida.toString()
            }
        }

        botonReset.setOnClickListener{
            contadorSalida.text = "0";
        }
    }
}