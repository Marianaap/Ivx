package br.com.arcom.promocoes.ui.brindes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.arcom.promocoes.databinding.FragmentBrindesBinding

class BrindesFragments: Fragment() {

    private lateinit var binding: FragmentBrindesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBrindesBinding.inflate(inflater, container, false)
        return binding.root

    }
}