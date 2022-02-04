package com.example.android_sopt.data.remote.api

import com.example.android_sopt.data.remote.model.user.ResponseUserData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface UserService {
    @Headers("Content-Type:application/json")
    @GET("user/{id}")
    fun getUserCheckId(): Call<ResponseUserData>

    @Headers("Content-Type:application/json")
    @GET("user?email={email}")
    fun getUserCheckEmail(): Call<ResponseUserData>
}