package com.marcos.secondactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val changeButton = findViewById<Button>(R.id.changeButton2)

        changeButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val intent = intent

        val clientesValue = intent.getIntExtra("clientes",0)
        val proveedoresValue = intent.getIntExtra("proveedores",0)
        val numClientes = findViewById<TextView>(R.id.textViewClientes)
        val numProveedores = findViewById<TextView>(R.id.textViewProveedores)
        numClientes.text = "Clientes: $clientesValue"
        numProveedores.text = "Proveedores: $proveedoresValue"
    }
}