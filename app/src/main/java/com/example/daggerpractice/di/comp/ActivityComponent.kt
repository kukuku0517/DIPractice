package com.example.daggerpractice.di.comp

import com.example.daggerpractice.*
import com.example.daggerpractice.di.module.ActivityModule
import com.example.daggerpractice.di.module.PerActivity
import com.example.daggerpractice.di.module.ViewModelFactoryModule
import com.example.daggerpractice.di.module.ViewModelModule
import dagger.Component

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityModule::class, ViewModelModule::class, ViewModelFactoryModule::class]
)
interface ActivityComponent {
    fun inject(activity: MainActivity)
}