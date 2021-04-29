package com.br.natanfc.filmesflix.framework.api

import com.br.natanfc.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
    //https://raw.githubusercontent.com/NeiTDutra/kotlin-mvvm_moviesJson/main/moviesList.json

    @GET("NeiTDutra/kotlin-mvvm_moviesJson/main/moviesList.json")
    fun getAllMovies(): Call<List<Movie>>
}