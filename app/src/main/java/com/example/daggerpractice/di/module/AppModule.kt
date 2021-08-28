package com.example.daggerpractice.di.module

import android.app.Application
import android.content.Context
import com.example.daggerpractice.CommonUtil
import com.example.daggerpractice.di.AppContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: Application) {

    @Provides
    @Singleton
    @AppContext
    fun context(): Context {
        return app.applicationContext
    }

    @Provides
    @Singleton
    fun commonUtil(): CommonUtil {
        app
        return CommonUtil()
    }

}