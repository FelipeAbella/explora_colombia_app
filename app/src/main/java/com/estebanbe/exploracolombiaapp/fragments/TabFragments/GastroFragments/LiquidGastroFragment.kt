package com.estebanbe.exploracolombiaapp.fragments.TabFragments.GastroFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.estebanbe.exploracolombiaapp.R


class LiquidGastroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liquid_gastro, container, false)
    }
}