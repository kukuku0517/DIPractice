package com.example.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}