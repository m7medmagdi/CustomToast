package com.m7med.customtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.m7med.customtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        setContentView(R.layout.activity_main)
        binding.btnunlike.setOnClickListener {

            val toast: Toast = Toast.makeText(this, "Like Toast", Toast.LENGTH_LONG) as Toast


        }
    }
}