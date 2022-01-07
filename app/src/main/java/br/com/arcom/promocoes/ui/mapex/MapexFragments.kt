package br.com.arcom.promocoes.ui.mapex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.arcom.promocoes.databinding.FragmentMapexBinding

class MapexFragments: Fragment() {

    private lateinit var binding: FragmentMapexBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMapexBinding.inflate(inflater, container, false)


        return binding.root

    }
}