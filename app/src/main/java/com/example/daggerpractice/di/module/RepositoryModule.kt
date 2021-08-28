package com.example.daggerpractice.di.module

import android.content.Context
import com.example.daggerpractice.MainRepository
import com.example.daggerpractice.MainUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun mainRepo(context: Context): MainRepository {
        return MainRepository(context)
    }

    @Provides
    fun mainUseCase(mainRepository: MainRepository): MainUseCase {
        return MainUseCase(mainRepository)
    }
}