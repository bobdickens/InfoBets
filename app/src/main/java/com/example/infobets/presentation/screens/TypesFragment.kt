package com.example.infobets.presentation.screens

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.MAIN
import com.example.infobets.R
import com.example.infobets.databinding.FragmentTypesBinding

class TypesFragment : Fragment() {
lateinit var binding: FragmentTypesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTypesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        binding.btnBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_typesFragment_to_startFragment)

        }
        binding.btnMoneylines.setOnClickListener {
            bundle.putString("name", getString(R.string.moneylines))
            bundle.putString("details", getString(R.string.moneylines_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnTotalRounds.setOnClickListener {
            bundle.putString("name", getString(R.string.total_rounds))
            bundle.putString("details", getString(R.string.total_rounds_detail))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnParlays.setOnClickListener {
            bundle.putString("name", getString(R.string.parlays))
            bundle.putString("details", getString(R.string.parlays_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnFutures.setOnClickListener {
            bundle.putString("name", getString(R.string.futures))
            bundle.putString("details", getString(R.string.futures_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnPropBets.setOnClickListener {
            bundle.putString("name", getString(R.string.prop_bets))
            bundle.putString("details", getString(R.string.prop_bets_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnBettingAgainstTheSpread.setOnClickListener {
            bundle.putString("name", getString(R.string.betting_against_the_spread))
            bundle.putString("details", getString(R.string.betting_against_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnTeaserBets.setOnClickListener {
            bundle.putString("name", getString(R.string.teaser_bets))
            bundle.putString("details", getString(R.string.teaser_bets_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
        binding.btnOverUnder.setOnClickListener {
            bundle.putString("name", getString(R.string.over_under))
            bundle.putString("details", getString(R.string.over_never_details))
            MAIN.navController.navigate(R.id.action_typesFragment_to_detailsFragment, bundle)
        }
    }


}