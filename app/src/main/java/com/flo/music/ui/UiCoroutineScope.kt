package com.flo.music.ui

import android.util.Log
import com.flo.music.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

class UiCoroutineScope : BaseScope {
    override val job: Job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    override fun releaseScope() {
        if (BuildConfig.DEBUG_MODE) {
            Log.d("UiCoroutineScope", "onRelease coroutine")
        }
        job.cancel()
    }
}