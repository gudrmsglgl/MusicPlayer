package com.flo.remote

import com.flo.data.model.MusicInfoEntity
import com.flo.data.repository.RemoteStore
import com.flo.remote.extension.transMusicInfoEntity
import com.flo.remote.service.MusicService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RemoteImpl
@Inject constructor(private val service: MusicService) : RemoteStore {
    override fun musicInfo(): Flow<MusicInfoEntity> = flow {
        emit(service.getMusicInfo().transMusicInfoEntity())
    }.flowOn(Dispatchers.IO)
}