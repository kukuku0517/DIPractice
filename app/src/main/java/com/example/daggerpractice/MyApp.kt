package com.example.daggerpractice

import android.app.Application
import com.example.daggerpractice.di.AppModule
import com.example.daggerpractice.di.DaggerMainComponent
import com.example.daggerpractice.di.MainModule

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        injectComponent()

    }

    private fun injectComponent() {
        DaggerMainComponent.builder()
            .mainModule(MainModule)
            .appModule(AppModule(this))
            .build()
    }
}