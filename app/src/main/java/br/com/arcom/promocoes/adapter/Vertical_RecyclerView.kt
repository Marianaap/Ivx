package br.com.arcom.promocoes.adapter

import android.animation.ObjectAnimator
import android.content.Context
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import br.com.arcom.promocoes.R
import com.google.android.material.button.MaterialButton


class Vertical_RecyclerView(var context: Context) :
    RecyclerView.Adapter<Vertical_RecyclerView.ViewHolder>() {

    val detalhamento =
        arrayListOf("Mapex", "Promoção", "Promoção", "Promoção", "Promoção", "Promoção", "Promoção")

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val detalheBtn: ImageView
        val cardDetalhe: ConstraintLayout
        val progressBar: ProgressBar

        init {
            detalheBtn = itemView.findViewById(R.id.expand_btn)
            progressBar = itemView.findViewById(R.id.progressBar)
            cardDetalhe = itemView.findViewById(R.id.card_detalhes)

        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardpromo, viewGroup, false)



        return ViewHolder(view)

    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val progressBar = viewHolder.progressBar


        viewHolder.detalheBtn.setOnClickListener(){
            if (viewHolder.cardDetalhe.visibility == View.GONE) {
                    viewHolder.cardDetalhe.visibility = View.VISIBLE
                    TransitionManager.beginDelayedTransition(viewHolder.cardDetalhe);


            }else {
                    TransitionManager.beginDelayedTransition(viewHolder.cardDetalhe);

                    viewHolder.cardDetalhe.visibility = View.GONE


        }
        }


        progressBar.max = 1000

        val currentProcess = 600

        ObjectAnimator.ofInt(progressBar, "progress", currentProcess)
            .setDuration(2000)
            .start()


    }

    override fun getItemCount() = 1

}





