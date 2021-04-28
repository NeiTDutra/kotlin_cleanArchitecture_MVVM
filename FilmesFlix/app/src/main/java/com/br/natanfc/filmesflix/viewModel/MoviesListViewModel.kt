package com.br.natanfc.filmesflix.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.natanfc.filmesflix.model.Movie

class MoviesListViewModel: ViewModel() {

    private val listOfMovies = arrayListOf(

            Movie(
                    id = 0,
                    titulo = "Título_1",
                    descricao = "Descrição título_1",
                    imagem = null,
                    dataLancamento = null
            ),
            Movie(
                    id = 1,
                    titulo = "Título_2",
                    descricao = "Descrição título_2",
                    imagem = null,
                    dataLancamento = null
            ),
            Movie(
                    id = 2,
                    titulo = "Título_3",
                    descricao = "Descrição título_3",
                    imagem = null,
                    dataLancamento = null
            ),
            Movie(
                    id = 3,
                    titulo = "Título_4",
                    descricao = "Descrição título_4",
                    imagem = null,
                    dataLancamento = null
            )
    )

    private var _moviesList = MutableLiveData<List<Movie>>()
    val moviesList: LiveData<List<Movie>>
    get() = _moviesList

    fun init() {
        getAllMovies()
    }

    private fun getAllMovies() {
        _moviesList.value = listOfMovies
    }
}