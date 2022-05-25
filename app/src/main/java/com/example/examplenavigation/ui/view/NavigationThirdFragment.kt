package com.example.examplenavigation.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.examplenavigation.databinding.NavigationThirdFragmentBinding

class NavigationThirdFragment : Fragment() {
    private lateinit var binding: NavigationThirdFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = NavigationThirdFragmentBinding.inflate(inflater, container, false)
        .apply { binding = this }
        .root
}