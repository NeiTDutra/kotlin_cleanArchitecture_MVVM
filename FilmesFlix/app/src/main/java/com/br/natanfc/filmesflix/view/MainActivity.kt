package com.br.natanfc.filmesflix.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.br.natanfc.filmesflix.R
import com.br.natanfc.filmesflix.model.Movie
import com.br.natanfc.filmesflix.viewModel.MoviesListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieListViewModel: MoviesListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieListViewModel = ViewModelProvider.NewInstanceFactory().create(MoviesListViewModel::class.java)
        movieListViewModel.init()

        initObserver()
        progressBar(true)
    }

    private fun initObserver() {
        movieListViewModel.moviesList.observe(this, { list ->
            if(list.isNotEmpty()) {
                populateList(list)
            }
        })
    }

    private fun populateList(list: List<Movie>) {
        moviesList.apply {
            hasFixedSize()
            adapter = MoviesAdapter(list)
        }
    }

    private fun progressBar(isLoading: Boolean) {
        progressBar.visibility = if(isLoading) View.VISIBLE else View.GONE
    }
}