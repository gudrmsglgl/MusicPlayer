package com.flo.music.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

interface BaseScope : CoroutineScope {
    val job: Job
    fun releaseScope()
}