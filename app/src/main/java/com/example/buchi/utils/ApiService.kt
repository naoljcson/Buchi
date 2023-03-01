package com.example.buchi.utils

import com.example.buchi.data.model.PetsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("pets")
    suspend fun getPets(): Response<PetsResponse>
}