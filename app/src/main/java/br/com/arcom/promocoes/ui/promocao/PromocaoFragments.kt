package br.com.arcom.promocoes.ui.promocao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.arcom.promocoes.databinding.FragmentPromocaoBinding

class PromocaoFragments: Fragment(){

    private lateinit var binding: FragmentPromocaoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPromocaoBinding.inflate(inflater, container, false)
        return binding.root

    }
}