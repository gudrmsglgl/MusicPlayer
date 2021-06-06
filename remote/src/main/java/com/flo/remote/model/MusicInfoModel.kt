package com.flo.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MusicInfoModel(
    @SerializedName("singer")
    @Expose
    val singer: String,

    @SerializedName("album")
    @Expose
    val album: String,

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("duration")
    @Expose
    val duration: Int,

    @SerializedName("image")
    @Expose
    val image: String,

    @SerializedName("file")
    @Expose
    val file: String,

    @SerializedName("lyrics")
    @Expose
    val lyrics: String
)
