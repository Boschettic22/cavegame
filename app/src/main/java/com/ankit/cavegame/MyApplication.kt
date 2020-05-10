package com.ankit.cavegame

import android.app.Application

class MyApplication: Application() {
    companion object {
        var grabaTorch: Boolean = false
        var torchMancy: Boolean = false
    }

    override fun onCreate() {
        super.onCreate()
    }
}