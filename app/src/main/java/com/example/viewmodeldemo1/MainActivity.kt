package com.example.viewmodeldemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClick: Button = findViewById(R.id.button)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            displayGreeting()
        }

        binding.buttonNextPage.setOnClickListener {
            startActivity(Intent(this, ProgressBarActivity::class.java))
        }

        binding.button3.setOnClickListener {
            startActivity(Intent(this, BindingDemo3Activity::class.java))
        }
    }

    private fun displayGreeting() {
        val messageView: TextView = findViewById(R.id.textView)
        val nameText: EditText = findViewById(R.id.editText)
        binding.textView.text = "Hello! " + binding.editText.text
    }
}