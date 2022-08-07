package com.dapascript.bottom.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dapascript.bottom.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (this::binding.isInitialized) {
            binding
        } else {
            binding = FragmentHomeBinding.inflate(inflater, container, false)
            val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
            homeViewModel.text.observe(viewLifecycleOwner) {
                binding.apply {
                    var number = 0
                    buttonAdd.setOnClickListener {
                        number += 1
                        textHome.text = number.toString()
                    }

                    buttonMin.setOnClickListener {
                        number -= 1
                        textHome.text = number.toString()
                    }
                }
            }
        }
        return binding.root
    }

}