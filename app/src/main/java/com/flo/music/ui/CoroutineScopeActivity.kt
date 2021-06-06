package com.flo.music.ui

import androidx.appcompat.app.AppCompatActivity

abstract class CoroutineScopeActivity
constructor(scope: UiCoroutineScope = UiCoroutineScope())
    : AppCompatActivity(), BaseScope by scope {

    override fun onDestroy() {
        super.onDestroy()
        releaseScope()
    }

}