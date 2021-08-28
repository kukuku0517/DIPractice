package com.example.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerpractice.databinding.ActivityMainBinding
import com.example.daggerpractice.di.comp.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerActivityComponent.builder()
            .appComponent((application as MyApp).appComponent)
            .build()
            .inject(this)


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txt.setOnClickListener {
            vm.test()
        }


    }
}