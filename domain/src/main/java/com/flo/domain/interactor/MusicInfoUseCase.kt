package com.flo.domain.interactor

import com.flo.domain.model.MusicInfo
import com.flo.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MusicInfoUseCase
@Inject constructor(private val repository: Repository) : UseCase<MusicInfo, Any> {
    override fun requestData(param: Any?): Flow<MusicInfo> = repository.musicInfo()
}