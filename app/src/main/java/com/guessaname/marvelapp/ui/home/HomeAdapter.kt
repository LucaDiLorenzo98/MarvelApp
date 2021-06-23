package com.guessaname.marvelapp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeViewHolder> (){

    // esempi manca collegamento dB
    private val names = arrayOf("Thor", "SpiderMan",
        "BatMan", "IronMan")

    private val description = arrayOf("Dio dei fulmini",
        "si arrampica", "è ricco", "è ricco e intelligente")



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.character_card, viewGroup, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: HomeViewHolder, i: Int) {

        viewHolder.itemNames.text = names[i]
        viewHolder.itemDescription.text = description[i]

    }

    // numero di oggetti
    override fun getItemCount(): Int {
        return names.size
    }


    inner class  HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemNames: TextView
        var itemDescription: TextView

        init {
            itemNames = itemView.findViewById(R.id.kategori)
            itemDescription = itemView.findViewById(R.id.description)
        }

    }

}

