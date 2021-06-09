package com.bangkit.aot.dampingi.api

import com.bangkit.aot.dampingi.data.DataSignUp
import com.bangkit.aot.dampingi.data.SignInRespone
import com.bangkit.aot.dampingi.data.SignUpRespone
import retrofit2.Call
import retrofit2.http.*

interface RestApi {

    @POST("api/v1/jwtauth/register/")
    @Headers("Accept: application/json")
    fun addRegister(
        @Body
        dataSignUp: DataSignUp
    ): Call<SignUpRespone>

    @FormUrlEncoded
    @POST("api/v1/token/")
    fun LoginUser(
        @Field("username") username: String,
        @Field("password") password: String,
    ): Call<SignInRespone>

}