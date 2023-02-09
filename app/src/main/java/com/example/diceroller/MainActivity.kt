//Dalvin Wray
//20216185
package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Declaring a public variable to hold the sum of the dice rolled
    var rollDiceTotal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)

        //telling the program how the roll button should behave when pressed
        rollButton.setOnClickListener{
            //calling the roll dice function which will display the dice
            rollDice()
        }

        //Display the dice when the app starts
       val firstDisplay:ImageView = findViewById(R.id.imageView)
        firstDisplay.setImageResource(R.drawable.dice_1)
    }

     private fun rollDice() {
        //creating instances of the Dice class
        val dice = Dice()
         val dice2=Dice()
        //assigning the roll method which selects a random number between 1 and 6, to the diceRoll variable
        val diceRoll=dice.roll()
         val diceRoll2= dice2.roll()
        //Selecting the image view on the screen and assigning it to the diceImage variable
        val diceImage: ImageView=findViewById(R.id.imageView)
        val diceImage2: ImageView=findViewById(R.id.imageView2)

         //Display the sum of the dice rolled
         val diceText: TextView=findViewById(R.id.textView)
         rollDiceTotal=diceRoll+diceRoll2
         diceText.text= rollDiceTotal.toString()


        //displays an image with the side of the dice that is same as the respective random number
        when(diceRoll) {
           1-> diceImage.setImageResource(R.drawable.dice_1)
           2-> diceImage.setImageResource(R.drawable.dice_2)
           3-> diceImage.setImageResource(R.drawable.dice_3)
           4-> diceImage.setImageResource(R.drawable.dice_4)
           5-> diceImage.setImageResource(R.drawable.dice_5)
           6-> diceImage.setImageResource(R.drawable.dice_6)
        }

         when(diceRoll2) {
             1-> diceImage2.setImageResource(R.drawable.dice_1)
             2-> diceImage2.setImageResource(R.drawable.dice_2)
             3-> diceImage2.setImageResource(R.drawable.dice_3)
             4-> diceImage2.setImageResource(R.drawable.dice_4)
             5-> diceImage2.setImageResource(R.drawable.dice_5)
             6-> diceImage2.setImageResource(R.drawable.dice_6)
         }



        //Tells a screen reader what number is associated with each side of a dice
        diceImage.contentDescription=diceRoll.toString()
         diceImage2.contentDescription=diceRoll2.toString()

    }






}

class Dice() {
    //selecting a random number between 1 and 6 which represents the numbers on the dice.
    fun roll(): Int {
        return (1..6).random()
    }



}

//Dalvin Wray
//20216185