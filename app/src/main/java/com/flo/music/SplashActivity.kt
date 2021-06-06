package com.flo.music

import android.content.Intent
import android.os.Bundle
import com.flo.music.ui.CoroutineScopeActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : CoroutineScopeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        launch {
            delay(2000L)
            navMainActivity()
            finish()
        }
    }

    private fun navMainActivity() = Intent(
        this,
        MainActivity::class.java
    ).apply {
        flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NO_HISTORY
    }.also {
        startActivity(it)
    }

}