package com.example.calcy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.add
import kotlinx.android.synthetic.main.activity_main.div
import kotlinx.android.synthetic.main.activity_main.editTextText
import kotlinx.android.synthetic.main.activity_main.editTextText2
import kotlinx.android.synthetic.main.activity_main.mul
import kotlinx.android.synthetic.main.activity_main.sub

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     add.setOnClickListener{
         if (editTextText.text.toString()!=""&& editTextText2.text.toString()!=""){

             val num1 = editTextText.text.toString().toInt()
             val num2 = editTextText2.text.toString().toInt()
             val sum = num1 + num2
             Toast.makeText(this,"The sum is $sum",Toast.LENGTH_LONG).show();
         }
     else{
         Toast.makeText(this,"please fill blanks",Toast.LENGTH_LONG).show();
         }
    }
 sub.setOnClickListener{
     if (editTextText.text.toString()!=""&& editTextText2.text.toString()!=""){

         val num1 = editTextText.text.toString().toInt()
         val num2 = editTextText2.text.toString().toInt()
         val sub = num1 - num2
         Toast.makeText(this,"The sub is $sub",Toast.LENGTH_LONG).show();
     }
     else{
         Toast.makeText(this,"please fill all the required blanks.",Toast.LENGTH_LONG).show();
     }
 }
        div.setOnClickListener {
            if (editTextText.text.toString() != "" && editTextText2.text.toString() != "") {

                val num1 = editTextText.text.toString().toInt()
                val num2 = editTextText2.text.toString().toInt()
                val div = num1 / num2
                Toast.makeText(this, "The div is $div", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "please fill all the required blanks.", Toast.LENGTH_LONG)
                    .show();
            }
            mul.setOnClickListener {
                if (editTextText.text.toString() != "" && editTextText2.text.toString() != "") {

                    val num1 = editTextText.text.toString().toInt()
                    val num2 = editTextText2.text.toString().toInt()
                    val mul = num1 * num2
                    Toast.makeText(this, "The mul is $mul", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "please fill all the required blanks.", Toast.LENGTH_LONG)
                        .show();
                }
            }
        }}}