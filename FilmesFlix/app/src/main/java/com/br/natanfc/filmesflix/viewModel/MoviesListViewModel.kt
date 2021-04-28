package com.br.natanfc.filmesflix.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.natanfc.filmesflix.api.MovieRestApiTask
import com.br.natanfc.filmesflix.model.Movie
import com.br.natanfc.filmesflix.repository.MovieRepository

class MoviesListViewModel: ViewModel() {

    companion object {
        const val TAG = "MovieRepository"
    }

    private val movieRestApiTask = MovieRestApiTask()
    private val movieRepository = MovieRepository(movieRestApiTask)
/*
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
*/
    private var _moviesList = MutableLiveData<List<Movie>>()
    val moviesList: LiveData<List<Movie>>
    get() = _moviesList

    fun init() {
        getAllMovies()
    }

    private fun getAllMovies() {
        Thread {
            try {
                _moviesList.postValue(movieRepository.getAllMovies())
            }
            catch (ex: Exception) {
                Log.d(TAG, ex.message.toString())
            }
        }
    }
}