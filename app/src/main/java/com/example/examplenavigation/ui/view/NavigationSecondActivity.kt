package com.example.examplenavigation.ui.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examplenavigation.databinding.NavigationSecondActivityBinding

class NavigationSecondActivity : AppCompatActivity() {
    private lateinit var binding: NavigationSecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = NavigationSecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}