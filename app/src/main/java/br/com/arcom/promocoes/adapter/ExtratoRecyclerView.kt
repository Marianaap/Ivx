package br.com.arcom.promocoes.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.arcom.promocoes.R

class ExtratoRecyclerView: RecyclerView.Adapter<ExtratoRecyclerView.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var posicao : TextView

        init {
            posicao = itemView.findViewById(R.id.txt_numero)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.descricao_promo, parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.posicao.text = position.toString()

    }

    override fun getItemCount() = 30
}