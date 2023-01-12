package com.marcos.secondactivity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    val TAG_ACTIVITY = "ACTIVITYCODE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = getIntent()

        val changeButton = findViewById<Button>(R.id.changeButton2)

        changeButton.setOnClickListener{
            //enviamos valores con setResult

            //valor: Hola
            intent.putExtra("saludo", "Hola")
            Log.d(TAG_ACTIVITY, "Se añade el nuevo dato")
            Log.d(TAG_ACTIVITY, "Activity.RESULT_OK = ${Activity.RESULT_OK}")

            //valor: Adios
            intent.putExtra("despedida", "Adios")
            Log.d(TAG_ACTIVITY, "Se añade otro dato")

            //enviamos los datos
            setResult(Activity.RESULT_OK, intent)
            Log.d(TAG_ACTIVITY, "Se envian los datos")

            //Tras enviar los datos, cerramos la MainActivity2
            finish()
        }



        //recibimos los valores y los mostramos
        val clientesValue = intent.getIntExtra("clientes",0)
        val proveedoresValue = intent.getIntExtra("proveedores",0)
        val numClientes = findViewById<TextView>(R.id.textViewClientes)
        val numProveedores = findViewById<TextView>(R.id.textViewProveedores)
        numClientes.text = "Clientes: $clientesValue"
        numProveedores.text = "Proveedores: $proveedoresValue"
    }
}