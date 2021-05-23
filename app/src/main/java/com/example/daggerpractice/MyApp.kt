package com.example.daggerpractice

import android.app.Application
import com.example.daggerpractice.di.MainModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

    }
}