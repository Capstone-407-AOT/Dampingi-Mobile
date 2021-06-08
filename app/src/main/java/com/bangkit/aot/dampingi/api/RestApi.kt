package com.bangkit.aot.dampingi.api

import com.bangkit.aot.dampingi.data.DataSignUp
import com.bangkit.aot.dampingi.data.SignInRespone
import com.bangkit.aot.dampingi.data.SignUpRespone
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RestApi {

    @POST("api/v1/jwtauth/register/")
    suspend fun addRegister(
            @Body
            dataSignUp: DataSignUp
    ): Call<DataSignUp>

    @FormUrlEncoded
    @POST("api/v1/token/")
    fun LoginUser(
        @Field("username") username:String,
        @Field("password") password:String,
    ): Call<SignInRespone>
}