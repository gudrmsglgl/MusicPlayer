package com.flo.data.repository

import com.flo.data.model.MusicInfoEntity
import kotlinx.coroutines.flow.Flow

interface DataStore {
    fun musicInfo(): Flow<MusicInfoEntity>
}