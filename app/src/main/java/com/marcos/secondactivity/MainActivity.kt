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

        // El botón para iniciar el teléfono
        val changeButton = findViewById<Button>(R.id.changeButton)
        // numero de telefono al que queremos llamar
        val url = findViewById<EditText>(R.id.textUrl)


        changeButton.setOnClickListener {
            // creamos un intent específico que iniciará el teléfono
            val intent = Intent(Intent.ACTION_VIEW)
            // rellenamos el intent con el número
            intent.data = Uri.parse(url.text.toString())
            // llamamos a la activity treléfono
            startActivity(intent)
        }
    }
}

