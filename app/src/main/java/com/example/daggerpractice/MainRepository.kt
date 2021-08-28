package com.example.daggerpractice

import android.content.Context
import com.example.daggerpractice.di.AppContext
import javax.inject.Inject

class MainRepository @Inject constructor(@AppContext context: Context) {
}