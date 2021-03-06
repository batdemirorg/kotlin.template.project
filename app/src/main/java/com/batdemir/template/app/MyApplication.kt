package com.batdemir.template.app

import android.app.Application
import com.batdemir.template.di.component.ApplicationComponent
import com.batdemir.template.di.component.DaggerApplicationComponent

class MyApplication : Application() {
    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent.initializer().initialize(this)
    }
}