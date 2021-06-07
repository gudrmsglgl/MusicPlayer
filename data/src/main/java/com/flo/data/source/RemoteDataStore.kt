package com.flo.data.source

import com.flo.data.model.MusicInfoEntity
import com.flo.data.repository.DataStore
import com.flo.data.repository.RemoteStore
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoteDataStore
@Inject constructor(private val remote: RemoteStore) : DataStore {

    override fun musicInfo(): Flow<MusicInfoEntity> = remote.musicInfo()

}