package com.koin.koinsampleapp.container

import android.app.Application
import com.koin.koinsampleapp.module.demoModule
import org.koin.core.context.startKoin


class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule)
        }
    }
}