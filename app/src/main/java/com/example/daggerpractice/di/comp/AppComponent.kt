package com.example.daggerpractice.di.comp

import android.content.Context
import com.example.daggerpractice.MyApp
import com.example.daggerpractice.di.AppContext
import com.example.daggerpractice.di.module.AppModule
import com.example.daggerpractice.di.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RepositoryModule::class])
interface AppComponent {

    fun inject(application: MyApp)

    @AppContext
    fun getContext(): Context

}