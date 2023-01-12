package com.example.viewmodeldemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.viewmodeldemo1.data.Student
import com.example.viewmodeldemo1.databinding.ActivityBindingDemo3Binding

class BindingDemo3Activity:AppCompatActivity() {
    private lateinit var binding: ActivityBindingDemo3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_demo3)
        val student: Student = getStudent()
        with(binding) {
            tvEmail.text = student.email
            tvName.text = student.name
        }
    }

    private fun getStudent():Student {
        return Student(1, "Alex", "alex@gmail.com")
    }
}