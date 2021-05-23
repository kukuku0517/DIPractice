package com.example.daggerpractice.di

import android.content.Context
import com.example.daggerpractice.MainRepository
import com.example.daggerpractice.MainUseCase
import com.example.daggerpractice.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ApplicationComponent::class)
object MainModule {
    @Provides
    fun provideViewModel(mainUseCase: MainUseCase): MainViewModel {
        return MainViewModel(mainUseCase)
    }

    @Provides
    fun provideUseCase(mainRepository: MainRepository): MainUseCase {
        return MainUseCase(mainRepository)
    }

    @Provides
    fun provideRepository(@ApplicationContext context: Context): MainRepository {
        return MainRepository(context)
    }
}
