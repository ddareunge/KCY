package com.example.mysecondapp.server

import com.example.ddareunge.data.PlaceItem
import retrofit2.Call
import retrofit2.http.*

interface GithubService {
    @GET("/bike")
    fun getPlaces(
    ): Call<PlaceItem>
}