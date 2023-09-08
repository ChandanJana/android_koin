package com.tutorial.koinapplication.data.api

import com.tutorial.koinapplication.data.model.User
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}