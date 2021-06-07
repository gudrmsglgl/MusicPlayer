package com.flo.data

import com.flo.data.extension.transMusicInfo
import com.flo.data.source.DataStoreFactory
import com.flo.domain.model.MusicInfo
import com.flo.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DataRepository
@Inject constructor(private val factory: DataStoreFactory) : Repository {

    override fun musicInfo(): Flow<MusicInfo> = factory
        .retrieveDataStore()
        .musicInfo()
        .map {
            it.transMusicInfo()
        }

}