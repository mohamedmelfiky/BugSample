package com.elfiky.testcoilepoxy

import android.app.Application
import coil.Coil
import coil.ImageLoader
import coil.util.DebugLogger

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val imageLoader = ImageLoader.Builder(this).logger(DebugLogger()).build()
        Coil.setImageLoader(imageLoader)
    }

}