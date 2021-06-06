package com.flo.domain.repository

import com.flo.domain.model.MusicInfo
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun musicInfo(): Flow<MusicInfo>
}