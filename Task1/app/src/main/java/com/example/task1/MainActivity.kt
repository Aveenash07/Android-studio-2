package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun onPause() {
        super.onPause()
        Log.d("name" , "There is pause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("name" , "There is Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("name" , "There is Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("name" , "There is Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("name" , "There is Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("name" , "There is Destroy")
    }




}