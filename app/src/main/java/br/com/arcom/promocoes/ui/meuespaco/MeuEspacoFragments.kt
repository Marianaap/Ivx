package br.com.arcom.promocoes.ui.meuespaco

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.arcom.promocoes.R
import br.com.arcom.promocoes.adapter.Vertical_RecyclerView
import br.com.arcom.promocoes.databinding.FragmentBrindesBinding.inflate
import br.com.arcom.promocoes.databinding.FragmentMapexBinding.inflate
import br.com.arcom.promocoes.databinding.FragmentMeuEspacoBinding
import com.example.promcoes.adapter.Horizontal_RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent

class MeuEspacoFragments : Fragment() {

    lateinit var contexto: Context
    lateinit var option: Spinner
    private lateinit var binding: FragmentMeuEspacoBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Horizontal_RecyclerView
    private lateinit var cardView: CardView
    private lateinit var adapterVertical: Vertical_RecyclerView


    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        binding = FragmentMeuEspacoBinding.inflate(inflater, container, false)

        contexto = requireContext()



        option = binding.barraOrdenar

        val options = arrayOf("Ordene Por:", "Promoção 1", "Promoção 2")

        option.adapter = ArrayAdapter<String>(this.contexto, android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {


            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {

            }

        }

        adapter = Horizontal_RecyclerView()
        adapterVertical = Vertical_RecyclerView(contexto)


        binding.recyclerview.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerview.adapter = adapter
        binding.recyclerview2.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.recyclerview2.adapter = adapterVertical


        return binding.root
    }


}