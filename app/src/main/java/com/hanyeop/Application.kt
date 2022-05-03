package com.hanyeop

import android.app.Application
import com.hanyeop.maniadb.repository.Repository

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        Repository.initialize(this)
    }
}