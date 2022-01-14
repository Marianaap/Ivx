package br.com.arcom.promocoes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.arcom.promocoes.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class Vertical_RecyclerView(var context: Context) : RecyclerView.Adapter<Vertical_RecyclerView.ViewHolder>() {

    val detalhamento = arrayListOf("Mapex","Promoção","Promoção","Promoção","Promoção","Promoção","Promoção")

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var detalheBtn: MaterialButton

        init {
            detalheBtn = itemView.findViewById(R.id.detalheBtn)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardpromo, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.detalheBtn.setOnClickListener {

                val adapter = DescricaoRecyclerView()

                val customDialog = LayoutInflater.from(context)
                    .inflate(R.layout.dialog_detalhes, null, false)

                val recyclerView = customDialog.findViewById<RecyclerView>(R.id.recyclerview)
                recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                recyclerView.adapter = adapter

                MaterialAlertDialogBuilder(context).setView(customDialog)
                    .setNegativeButton("Fechar") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .show()
            }


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = 5


}




