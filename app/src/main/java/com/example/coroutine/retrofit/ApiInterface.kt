package com.example.coroutine.retrofit

import com.example.coroutine.model.Post
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    suspend fun getAllPost() : List<Post>
}