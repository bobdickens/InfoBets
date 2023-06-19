package com.example.infobets.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.MAIN
import com.example.infobets.R
import com.example.infobets.databinding.FragmentDetailsBinding
import com.example.infobets.databinding.FragmentStrategyBinding

class StrategyFragment : Fragment() {
lateinit var binding: FragmentStrategyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStrategyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        binding.btnBack3.setOnClickListener {
            MAIN.navController.navigate(R.id.action_strategyFragment_to_startFragment)
        }

        binding.btn1x.setOnClickListener {
            bundle.putString("name", getString(R.string._1x_on_home_outsiders_strategy))
            bundle.putString("details", getString(R.string.x_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }

        binding.beat.setOnClickListener {
            bundle.putString("name", getString(R.string.beat_the_bookies_with_the_overlyzer_live_tool))
            bundle.putString("details", getString(R.string.beat_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }
        binding.btnAllIn.setOnClickListener {
            bundle.putString("name", getString(R.string.all_in_on_odds_at_1_20_strategy))
            bundle.putString("details", getString(R.string.all_in_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }

        binding.btn123System.setOnClickListener {
            bundle.putString("name", getString(R.string.the_1_3_2_6_system))
            bundle.putString("details", getString(R.string.sysytem_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }

        binding.btnFibbonacci.setOnClickListener {
            bundle.putString("name", getString(R.string.the_fibonacci_betting_system))
            bundle.putString("details", getString(R.string.fibbonacci_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }

        binding.btnKellyFormula.setOnClickListener {
            bundle.putString("name", getString(R.string.the_kelly_formula))
            bundle.putString("details", getString(R.string.kelly_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }

        binding.dutching.setOnClickListener {
            bundle.putString("name", getString(R.string.dutching_in_sports_betting))
            bundle.putString("details", getString(R.string.dutching_in_sports_betting))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }
        binding.early.setOnClickListener {
            bundle.putString("name", getString(R.string.early_cashout_in_sports_betting))
            bundle.putString("details", getString(R.string.early_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }
        binding.betLive.setOnClickListener {
            bundle.putString("name", getString(R.string.bet_live_on_over_1_5_goals))
            bundle.putString("details", getString(R.string.beat_live_d))
            MAIN.navController.navigate(R.id.action_strategyFragment_to_detailsStrategyFragment, bundle)
        }
    }
}