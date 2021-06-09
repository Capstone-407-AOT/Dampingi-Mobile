package com.bangkit.aot.dampingi.data

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


class DataSignUp(
        @field:SerializedName("username") var musername: String,
        @field:SerializedName("email") var memail: String,
        @field:SerializedName("password") var mpassword: String,
        @field:SerializedName("password2") var mpassword2: String
)