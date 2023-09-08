package com.tutorial.koinapplication.data.api

import com.tutorial.koinapplication.data.model.User
import retrofit2.Response

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}