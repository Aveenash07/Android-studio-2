package com.example.hangmangame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.reflect.Array
import java.util.Random

class MainActivity : AppCompatActivity() {
    val wordBox = arrayOf("asia","africa","antarctica","europe","north america","oceania","south america","arctic ocean", "atlantic ocean","pacific ocean", "indian ocean","southern ocean")
    val pics = arrayOf(R.drawable.slidetwo, R.drawable.slidethree, R.drawable.slidefour, R.drawable.slidefive, R.drawable.slidesix, R.drawable.slideseven)
    var moves = 0
    lateinit var wordToGuess: String
    lateinit var wordToGuessArray: CharArray
    lateinit var currentGuessed: CharArray
    var txtGuess = ""
    var wrongGuessed = arrayOf('?','?','?','?','?','?','?')
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wordToGuess = wordBox[Random().nextInt(12)]
        createQmarks()
        wordToGuessArray = wordToGuess.toCharArray()
        currentGuessed = txtGuess.toCharArray()

    }
    // This method will make questionmarks eqaual to the characters of machine guessed words
    fun createQmarks(){
        txtGuess = ""
        for(ch in wordToGuess){
            if(ch.equals(' ')){
                txtGuess += " "
            }
            else{
                txtGuess += '?'
            }
        }
        findViewById<TextView>(R.id.txtword).text = txtGuess
    }

    fun convertText(char: Char){

        var newStr = ""
        //findViewById<TextView>(R.id.txtword).text = char.toString()
        var theIterator = 0
        if(currentGuessed.contains(char)){
            Toast.makeText(applicationContext,"It is already guessed", Toast.LENGTH_LONG).show()
        }
        else {
            for (ch in wordToGuessArray) {
                if (ch.equals(char)) {
                    currentGuessed[theIterator] = char
                }
                theIterator++
            }
            for (curr in currentGuessed) {
                newStr += curr
            }
            findViewById<TextView>(R.id.txtword).text = newStr
            if ((!currentGuessed.contains('?'))) {
                findViewById<TextView>(R.id.txtInfo).text = "You Won"
            }
            var infotext = findViewById<TextView>(R.id.txtInfo).text.toString() + char
            findViewById<TextView>(R.id.txtInfo).text = infotext
        }
    }
    fun newButton(view: View){
        wordToGuess = wordBox[Random().nextInt(12)]
        createQmarks()
        wordToGuessArray = wordToGuess.toCharArray()
        currentGuessed = txtGuess.toCharArray()
        findViewById<Button>(R.id.btnCheck).isClickable = true
        findViewById<TextView>(R.id.txtInfo).text = this.getString(R.string.Info)
        moves = 0
        findViewById<ImageView>(R.id.imgPics).setImageResource(R.drawable.slideone)
    }
    fun check(view: View){
        var theText = findViewById<TextView>(R.id.txtchar).text
        var input = theText[0].lowercaseChar()
        // Trickery in the next two lines


        if(wordToGuess.contains(input)){
            convertText(input)
        }
        else{
            if(wrongGuessed.contains(input)) {
                Toast.makeText(applicationContext,"Alrady Guessed", Toast.LENGTH_LONG).show()
            }
            else {
                var infotext2 = findViewById<TextView>(R.id.txtInfo).text.toString() + input
                findViewById<TextView>(R.id.txtInfo).text = infotext2
                wrongGuessed[moves] = input
                if (moves <= 5) {
                    findViewById<ImageView>(R.id.imgPics).setImageResource(pics[moves])
                    moves++
                } else {
                    findViewById<TextView>(R.id.txtInfo).text =
                        "You are out of Guesses\n Please press New"
                    findViewById<Button>(R.id.btnCheck).isClickable = false
                }

            }
        }

    }
}