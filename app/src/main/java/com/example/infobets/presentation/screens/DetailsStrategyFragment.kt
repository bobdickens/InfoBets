package com.example.infobets.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.MAIN
import com.example.infobets.R
import com.example.infobets.databinding.FragmentDetailsStrategyBinding


class DetailsStrategyFragment : Fragment() {
lateinit var binding: FragmentDetailsStrategyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailsStrategyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val details = arguments?.getString("details")
        binding.tvName.text = name
        binding.tvDetails.text = details

        binding.btnBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_detailsStrategyFragment_to_strategyFragment)
        }
        binding.btnBack2.setOnClickListener {
            MAIN.navController.navigate(R.id.action_detailsStrategyFragment_to_strategyFragment)
        }
    }
}