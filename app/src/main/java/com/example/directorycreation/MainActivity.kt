package com.example.directorycreation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button_id)
        val text:TextView = findViewById(R.id.text)

        btn.setOnClickListener(View.OnClickListener { view ->
            text.setText(createDirectory("Frisbee").path)
        })

    }

    fun createDirectory(dirname:String):File{
        val path=applicationContext.getExternalFilesDir(null)
        val file=File(path,dirname)
        if(!file.exists()){
            file.mkdir()
        }
        return file

    }
}