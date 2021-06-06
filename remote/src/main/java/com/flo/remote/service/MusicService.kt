package com.flo.remote.service

import com.flo.remote.model.MusicInfoModel
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface MusicService {
    @GET("song.json")
    fun getMusicInfo(): Flow<MusicInfoModel>
}