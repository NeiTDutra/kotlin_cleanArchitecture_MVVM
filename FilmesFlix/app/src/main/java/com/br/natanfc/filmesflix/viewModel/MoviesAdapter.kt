package com.br.natanfc.filmesflix.viewModel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.natanfc.filmesflix.view.MoviesViewHolder
import com.br.natanfc.filmesflix.R
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MoviesAdapter: RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.itemView.movieTitle
    }

    override fun getItemCount(): Int = 0
}