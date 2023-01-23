package com.marcos.secondactivity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    val RESULT_CAMERA = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var changeButton = findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            //Creamos un intent que inicia la camara cuando pulsamos el boton
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            //llamamos a la activity de la camara
            startActivityForResult(intent, RESULT_CAMERA)
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageView = findViewById<ImageView>(R.id.imageView)
        if (requestCode == RESULT_CAMERA && resultCode == RESULT_OK && data != null) {
            //recogemos la imagen tomada en una variable de tipo Bitmap
            val imageBitmap = data.extras!!.get("data") as Bitmap
            //Le mostramos la foto sacada al usuario mediante el imageView
            imageView.setImageBitmap(imageBitmap)

        }
    }
}

