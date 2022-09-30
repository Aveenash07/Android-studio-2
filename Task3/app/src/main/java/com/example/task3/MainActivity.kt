package com.example.task3


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    lateinit var quant : TextView
    var takeQuantity by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quant = findViewById<TextView>(R.id.textView3)

    }

    var chocolate = ""
    var cream = ""
    var number = 0
    var price =  0f




    fun decreaseQuantity(view : View){
       // if(takeQuantity <= 0){
         //   quant.text = number.toString()
       // }

        //else{
            number -= 1
            quant.text = number.toString()

        //}
    }

    fun increaseQuantity(view : View){
        number += 1
        quant.text = number.toString()
    }

    fun checkCream(view: View){
        var check1 = findViewById<CheckBox>(R.id.checkBox)

        if(check1.isChecked){
            cream = "Yes"
        }

        else{
            cream = "No"
        }


    }

    fun checkChocolate(view : View){
        var check2 = findViewById<CheckBox>(R.id.checkBox2)

        if(check2.isChecked){
            chocolate = "Yes"
        }

        else{
            chocolate = "No"
        }
    }


    @SuppressLint("SetTextI18n")
    fun placeOrder(view : View){

        if(cream == "Yes"){
            price += 0.5f
        }

        if(chocolate == "Yes"){
            price += 1
        }


        var summary = findViewById<TextView>(R.id.textView5)
        takeQuantity = Integer.parseInt(findViewById<TextView>(R.id.textView3).text.toString())


        summary.text =
            "Add whipped cream?" + cream + "\n" + "Add Chocolate?" + chocolate + "\n" + "Quantity: " + takeQuantity +
            "\n" + "Price: $" + ((4 * takeQuantity) + price) + "\n" + "THANK YOU!"



    }
}