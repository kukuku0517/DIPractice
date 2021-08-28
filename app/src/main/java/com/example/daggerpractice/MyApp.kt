package com.example.daggerpractice

import android.app.Application
import com.example.daggerpractice.di.module.AppModule
import com.example.daggerpractice.di.comp.AppComponent
import com.example.daggerpractice.di.comp.DaggerAppComponent

class MyApp : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        injectComponent()

    }

    private fun injectComponent() {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
            .apply {
                appComponent = this
                inject(this@MyApp)
            }
    }
}