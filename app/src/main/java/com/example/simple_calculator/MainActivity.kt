package com.example.simple_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        private var etNumber1 : EditText? = null
        private var etNumber2 : EditText? = null
        private var tvDisplay : TextView  = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<EditText>(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnadd)
        btnAdd.setOnClickListener {
            add()
            }
            val btnsubtaction = findViewById<Button>(R.id.btnsubtract)
            btnsubtaction.setOnClickListener{
                sub()
            }

            val btnMultiplication= findViewById<Button>(R.id.btnmultiply)
            btnAdd.setOnClickListener {
                mult()
            }

            val btndivide = findViewById<Button>(R.id.btndivide)
            btnAdd.setOnClickListener {
                divs()
            }

            private fun add(){
                var intNum1:Int = 0
                var intnum2:Int = 0
                var intAns: = 0

                intNum1 = etNumber1.text.toString().toInt()
                intnum2 = etNumber2.text.toString().toInt()

                intAns = intNum1 + intnum2 

            }
        }
    }