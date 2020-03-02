package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonMathSum.setOnClickListener {
            doMath()
        }

    }

    private fun doMath() {
        val sum = variableA.text.toInt() + variableB.text.toInt()
        resultLabel.text = sum.toString()
    }

}

private fun Editable.toInt() = this.toString().toInt()
