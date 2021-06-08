package com.bangkit.aot.dampingi.data

import kotlinx.serialization.Serializable


@Serializable
data class DataSignUp (
        val username:String,
        val email:String,
        val password:String,
        val password2:String
        )