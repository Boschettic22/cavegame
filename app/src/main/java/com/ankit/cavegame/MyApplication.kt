package com.ankit.cavegame

import android.app.Application
import com.ankit.cavegame.database.DatabaseHelper


class MyApplication: Application() {

    var database: DatabaseHelper? = null

    companion object {
        var grabaTorch: Boolean = false
        var torchMancy: Boolean = false

    }

    override fun onCreate() {
        super.onCreate()
        database = DatabaseHelper(applicationContext)
    }

}