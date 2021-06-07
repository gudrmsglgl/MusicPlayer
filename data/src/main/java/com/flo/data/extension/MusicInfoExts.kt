package com.flo.data.extension

import com.flo.data.model.MusicInfoEntity
import com.flo.domain.model.MusicInfo

fun MusicInfoEntity.transMusicInfo() =
    MusicInfo(this.singer, this.album, this.duration, this.image, this.file, this.lyrics)
