package com.bangkit.aot.dampingi.ui.fitur.forum.dataForum

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataSubyek(
    val imageSrc: Int,
    val titleSubyek: String,
    val user: String,
    val chatUser: String
) : Parcelable