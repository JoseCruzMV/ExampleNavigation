package com.example.examplenavigation.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
    ) = NavigationFirstBinding.inflate(inflater, container, false)
        .apply { binding = this }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            buttonFragment.setOnClickListener { toThirdFragment() }
            buttonActivity.setOnClickListener { toSecondActivity() }
        }
    }

    private fun toThirdFragment() = findNavController().navigate(
        NavigationFirstFragmentDirections.fromFirstToThird()
    )

    private fun toSecondActivity() = findNavController().navigate(
        NavigationFirstFragmentDirections.fromFirstToSecond()
    )
}

