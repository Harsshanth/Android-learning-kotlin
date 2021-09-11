package com.example.api_call

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var message: EditText = findViewById(R.id.message)
        var button : Button = findViewById(R.id.button)
        var cnt : TextView = findViewById(R.id.cnt)

        button.setOnClickListener{
            lifecycleScope.launch{
                val response = withContext(Dispatchers.IO){
                ServiceLocator.chatService.getMessage(message = message.text.toString())
                }
               cnt.text = response.cnt
            }

        }
    }
}





