package com.example.dsa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    lateinit var editTextIND: EditText
    lateinit var btnCalc : Button
    lateinit var editTextUSA: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextIND = findViewById(R.id.editTextIND)
        btnCalc = findViewById(R.id.btnCalc)

        btnCalc.setOnClickListener(View.OnClickListener {
            val ind = editTextIND.text.toString()
            var num:Int = ind.toInt()
            calculate(num)
        })
    }

    fun calculate(ind : Int){
        editTextUSA = findViewById(R.id.editTextUSA)
        var ans = (ind * 73).toString()

        editTextUSA.setText(ans)
    }

}