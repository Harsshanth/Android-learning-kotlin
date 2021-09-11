package com.example.api_call

import retrofit2.http.GET
import retrofit2.http.Query

interface ChatService {
    @GET("get")
    suspend fun getMessage(
        @Query ("msg") message : String,
        @Query("bid") bid : Int = 158249,
        @Query("key") key : String = "spYNcFXB3JzJI49V",
        @Query("uid") uid : String = "Harsshanth",
    ): Response
}