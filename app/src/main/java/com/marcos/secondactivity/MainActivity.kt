package com.marcos.secondactivity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val changeButton = findViewById<Button>(R.id.changeButton)
        val numeroTlf = findViewById<EditText>(R.id.textUrl)

        changeButton.setOnClickListener {
            // creamos un intent que abre el telefono
            val intent = Intent(Intent.ACTION_DIAL)
            //le pasamos al intent el numero de tlf
            intent.data = Uri.parse("tel:" + numeroTlf.text)
            //ejecutamos la activity, la cual abrira el telefono con el numero dado
            startActivity(intent)
        }
    }
}

