package com.zeek1910.laboratoryworkexamples

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RickAndMortiApi {

    @GET("character")
    suspend fun getCharacters(): BaseResponse<CharacterResponse>

    @GET("episode")
    suspend fun getEpisodes(): BaseResponse<EpisodeResponse>


    companion object {

        private const val BASE_URL = "https://rickandmortyapi.com/api/"

        fun getApi(): RickAndMortiApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(RickAndMortiApi::class.java)
        }
    }
}