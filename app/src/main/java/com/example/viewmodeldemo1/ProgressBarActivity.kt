package com.example.viewmodeldemo1

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.viewmodeldemo1.databinding.ActivityProgressBarBinding

class ProgressBarActivity: AppCompatActivity() {
    private lateinit var binding: ActivityProgressBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_progress_bar)

        binding.button2.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        with(binding) {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                button2.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                button2.text = "Start"
            }
        }

//        if (binding.progressBar.visibility == View.GONE) {
//            binding.progressBar.visibility = View.VISIBLE
//            binding.button2.text = "Stop"
//        } else {
//            binding.progressBar.visibility = View.GONE
//            binding.button2.text = "Start"
//        }
    }
}