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
        val url = findViewById<EditText>(R.id.textUrl)


        changeButton.setOnClickListener {
            // creamos un intent que abre el navegador
            val intent = Intent(Intent.ACTION_VIEW)
            // le damos al intent la url que queremos
            intent.data = Uri.parse(url.text.toString())
            // iniciamos la activity del navegador con la url
            startActivity(intent)
        }
    }
}

