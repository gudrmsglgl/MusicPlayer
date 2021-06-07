package com.flo.remote.extension

import com.flo.data.model.MusicInfoEntity
import com.flo.remote.model.MusicInfoModel

fun MusicInfoModel.transMusicInfoEntity() =
    MusicInfoEntity(this.singer, this.album, this.duration, this.image, this.file, this.lyrics)