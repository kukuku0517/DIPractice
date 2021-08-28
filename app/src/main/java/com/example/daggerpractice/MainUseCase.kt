package com.example.daggerpractice

import android.util.Log
import javax.inject.Inject

class MainUseCase @Inject constructor(mainRepository: MainRepository) {
    fun invoke() {
        Log.i("kjh", "invoke: ")
    }
}