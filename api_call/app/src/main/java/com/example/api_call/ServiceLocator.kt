package com.example.api_call

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceLocator {
    private var _chatService: ChatService? = null
    val chatService: ChatService
        get() {
            return _chatService ?: Retrofit.Builder()
                .baseUrl(
                        "http://api.brainshop.ai/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ChatService::class.java)
        }
}