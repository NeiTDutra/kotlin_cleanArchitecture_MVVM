package com.br.natanfc.filmesflix.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRestApiTask {
    companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/"

    }

    private fun moviesProvide(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun retrofitApi(): MovieApi = moviesProvide().create(MovieApi::class.java)
}