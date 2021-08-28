package com.example.daggerpractice

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(val mainUseCase: MainUseCase) : ViewModel() {
    fun test() {
        mainUseCase.invoke()
    }
}