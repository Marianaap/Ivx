package br.com.arcom.promocoes.ui.meuespaco

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.arcom.promocoes.adapter.Vertical_RecyclerView
import br.com.arcom.promocoes.databinding.FragmentMeuEspacoBinding
import com.example.promcoes.adapter.Horizontal_RecyclerView

class MeuEspacoFragments : Fragment() {

    private lateinit var binding: FragmentMeuEspacoBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Horizontal_RecyclerView
    private lateinit var cardView: CardView
    private lateinit var adapterVertical: Vertical_RecyclerView

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentMeuEspacoBinding.inflate(inflater, container, false)


        adapter = Horizontal_RecyclerView()
        adapterVertical = Vertical_RecyclerView()

        binding.recyclerview.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerview.adapter = adapter
        binding.recyclerview2.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        binding.recyclerview2.adapter = adapterVertical

        return binding.root
    }
}