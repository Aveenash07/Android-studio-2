package com.example.task4_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    lateinit var result : EditText
    var value1 by Delegates.notNull<Int>()
    var value2 by Delegates.notNull<Int>()

    lateinit var operand : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById<EditText>(R.id.text1)
    }




    fun AC(view: View){
        result.setText("")
    }

    @SuppressLint("SetTextI18n")
    fun percent(view : View){
        value1 = Integer.parseInt(result.text.toString())
        operand = "%"
        result.setText("")
    }


    @SuppressLint("SetTextI18n")
    fun divide(view : View){
        value1 = Integer.parseInt(result.text.toString())
        operand = "\\"
        result.setText("")

    }

    @SuppressLint("SetTextI18n")
    fun mul(view: View){

        value1 = Integer.parseInt(result.text.toString())
        operand = "*"
        result.setText("")


    }

    @SuppressLint("SetTextI18n")
    fun subtract(view: View){
        value1 = Integer.parseInt(result.text.toString())
        operand = "-"
        result.setText("")


    }

    @SuppressLint("SetTextI18n")
    fun add(view: View){
       // mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

        value1 = Integer.parseInt(result.text.toString())
        operand = "+"
        result.setText("")

    }

    fun equal(view: View){
        value2 = Integer.parseInt(result.text.toString())
        result.setText("")

        if(operand == "+"){
             result.setText(value1 + value2).toString()
        }

        if(operand == "-"){
            result.setText(value1 - value2).toString()
        }

        if(operand == "*"){
            result.setText(value1 * value2).toString()
        }

        if(operand == "/"){
            result.setText(value1 / value2).toString()
        }

        if(operand == "%"){
            result.setText((value1 / value2) * 100).toString()
        }
    }


    @SuppressLint("SetTextI18n")
    fun seven(view : View){
        result.setText(result.text.toString() +  "7")
    }

    @SuppressLint("SetTextI18n")
    fun eight(view : View){
        result.setText(result.text.toString() +  "8")
    }

    @SuppressLint("SetTextI18n")
    fun nine(view : View){
        result.setText(result.text.toString() +  "9")

    }

    @SuppressLint("SetTextI18n")
    fun four(view : View){
        result.setText(result.text.toString() +  "4")

    }

    @SuppressLint("SetTextI18n")
    fun five(view : View){
        result.setText(result.text.toString() +  "5")

    }

    @SuppressLint("SetTextI18n")
    fun six(view : View){
        result.setText(result.text.toString() +  "6")

    }

    @SuppressLint("SetTextI18n")
    fun one(view: View){
        result.setText(result.text.toString() +  "1")

    }

    @SuppressLint("SetTextI18n")
    fun two(view: View){
        result.setText(result.text.toString() +  "2")

    }

    @SuppressLint("SetTextI18n")
    fun three(view: View){
        result.setText(result.text.toString() +  "3")
    }

    @SuppressLint("SetTextI18n")
    fun zero(view: View){
        result.setText(result.text.toString() +  "0")
    }


}