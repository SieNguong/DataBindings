package com.android.example.databindings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.example.databindings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p =  Person( name= "Ken", email = "kenwong0515@gmail.com", icNo = "123456-10-7890", address = "4 Jalan 9/5a")

            binding.personDetail = p

        }

        binding.btnSecond.setOnClickListener(){

            var p =  Person( name= "Chong", email = "chong123@gmail.com", icNo = "123456-10-7890", address = "20 Jalan 9/5a")

            binding.personDetail = p
        }
    }
}