package com.example.infobets.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.MAIN
import com.example.infobets.R
import com.example.infobets.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    lateinit var binding: FragmentStartBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTypes.setOnClickListener{
        MAIN.navController.navigate(R.id.action_startFragment_to_typesFragment)
        }

        binding.btnStrategyBets.setOnClickListener {
            MAIN.navController.navigate(R.id.action_startFragment_to_strategyFragment)
        }
    }

}