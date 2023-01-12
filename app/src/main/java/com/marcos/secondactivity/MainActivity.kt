package com.marcos.secondactivity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG_ACTIVITY = "ACTIVITYCODE"
    val RESULTADO_1 = 1
    val RESULTADO_2 = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var changeButton = findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("clientes", 5)
            intent.putExtra("proveedores", 90)


            startActivityForResult(intent, RESULTADO_1)
            startActivityForResult(intent, RESULTADO_2)




        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d(TAG_ACTIVITY, "Recibe el dato: ${data?.getStringExtra("saludo")}")
        super.onActivityResult(requestCode, resultCode, data)
        //difinimos un textView para visualizar el dato de la MainActivity2
        val saludo = findViewById<TextView>(R.id.textViewSaludo)
        val despedida = findViewById<TextView>(R.id.textViewAdios)

        Log.d(TAG_ACTIVITY, "requestCode = $requestCode")
        Log.d(TAG_ACTIVITY,"Activity.RESULT_OK = ${Activity.RESULT_OK}")

        //si es OK
        if (requestCode != Activity.RESULT_OK) {
            Log.d(TAG_ACTIVITY, "Entra en el if(requestCode != Activity.RESULT_OK)")
            //Hace diferentes cosas segun el requestCode
            when (requestCode) {
                RESULTADO_1 -> {
                    Log.d(TAG_ACTIVITY, "requestCode = RESULTADO_1")
                    if (data != null) {
                        Log.d(TAG_ACTIVITY, "El intent no es null")
                        saludo.text = data.getStringExtra("saludo")
                    };}
                RESULTADO_2 -> {
                    Log.d(TAG_ACTIVITY, "requestCode = RESULTADO_2")
                    if (data != null) {
                        Log.d(TAG_ACTIVITY, "El intent no es null")
                        despedida.text = data.getStringExtra("despedida")
                    };}
                else -> {}
            }
        }
    }

}