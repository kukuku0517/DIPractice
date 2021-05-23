package com.example.daggerpractice.di

import android.content.Context
import com.example.daggerpractice.MainActivity
import com.example.daggerpractice.MainRepository
import com.example.daggerpractice.MainUseCase
import com.example.daggerpractice.MainViewModel
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
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
    fun provideRepository(context: Context): MainRepository {
        return MainRepository(context)
    }
}

@Module
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun context(): Context {
        return context
    }

}

@Singleton
@Component(modules = [MainModule::class, AppModule::class])
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): MainComponent
        fun mainModule(mainModule: MainModule): Builder
        fun appModule(appModule: AppModule): Builder
    }
}