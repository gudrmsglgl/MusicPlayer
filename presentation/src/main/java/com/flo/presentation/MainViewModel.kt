package com.flo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.flo.domain.interactor.MusicInfoUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class MainViewModel
@Inject constructor(
    private val musicInfoUseCase: MusicInfoUseCase
): ViewModel() {

    private val _musicInfo: MutableStateFlow<String> = MutableStateFlow("")

    fun requestMusicInfo() = musicInfoUseCase
        .execute(
            scope = viewModelScope,
            param = null,
            onSuccess = {

            },
            onError = {

            }
        )

}