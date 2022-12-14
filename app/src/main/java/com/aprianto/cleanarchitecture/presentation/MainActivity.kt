package com.aprianto.cleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aprianto.cleanarchitecture.databinding.ActivityMainBinding
/*
* TODO 11 :
*  - membuat code untuk inisiasi tampilan secara dinamis (observable) berdasarkan viewmodel
* */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]
        viewModel.setName("Dicoding")
        viewModel.message.observe(this) {
            binding.tvWelcome.text = it.welcomeMessage
        }
    }
}