package com.example.examplenavigation.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.examplenavigation.databinding.NavigationFirstBinding

class NavigationFirstFragment : Fragment() {
    private var binding: NavigationFirstBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = NavigationFirstBinding.inflate(inflater, container, false)
        .apply { binding = this }
        .root
}