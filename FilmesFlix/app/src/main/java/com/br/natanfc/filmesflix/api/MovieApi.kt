package com.br.natanfc.filmesflix.api

import com.br.natanfc.filmesflix.model.Movie
import retrofit2.http.GET

interface MovieApi {
    //https://raw.githubusercontent.com/NeiTDutra/kotlin-mvvm_moviesJson/main/moviesList.json

    @GET("NeiTDutra/kotlin-mvvm_moviesJson/main/moviesList.json")
    fun getAllMovies(): List<Movie>
}