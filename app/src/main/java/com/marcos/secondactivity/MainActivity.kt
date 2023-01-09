package com.marcos.secondactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var changeButton = findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("clientes", 5)
            intent.putExtra("proveedores", 90)
            startActivity(intent)
        }
    }
}