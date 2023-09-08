package com.tutorial.koinapplication

import android.app.Application
import com.tutorial.koinapplication.di.module.appModule
import com.tutorial.koinapplication.di.module.repoModule
import com.tutorial.koinapplication.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(listOf( appModule, repoModule, viewModelModule))
        }
    }
}