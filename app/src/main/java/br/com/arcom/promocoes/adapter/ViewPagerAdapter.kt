package com.example.promcoes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.arcom.promocoes.ui.brindes.BrindesFragments
import br.com.arcom.promocoes.ui.mapex.MapexFragments
import br.com.arcom.promocoes.ui.meuespaco.MeuEspacoFragments
import br.com.arcom.promocoes.ui.promocao.PromocaoFragments


class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4

    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {

            0 -> {
                MeuEspacoFragments()
            }
            1 -> {
                BrindesFragments()
            }
            2 -> {
                MapexFragments()
            }
            3 -> {
                PromocaoFragments()
            }
            else -> {
                Fragment()


            }
        }

    }
}