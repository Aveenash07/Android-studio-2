package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeImage(view : View){

        val textView = findViewById<EditText>(R.id.msg1)
        val img = findViewById<ImageView>(R.id.imageView)
        textView.setText("I am full").toString()

        img.setImageResource(R.drawable.smiling);



    }
}