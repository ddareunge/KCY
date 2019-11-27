package com.example.mysecondapp.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GithubServicelmpl {
    private const val BASE_URL = "http://15.165.97.165:3000"

    private val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val yejin_retrofit:Retrofit = Retrofit.Builder()
        .baseUrl("ssh -i 25_SOPT_cyh.pem ubuntu@13.209.62.201:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service:GithubService = retrofit.create(GithubService::class.java)
    val yejin_service:GithubService = yejin_retrofit.create(GithubService::class.java)
}