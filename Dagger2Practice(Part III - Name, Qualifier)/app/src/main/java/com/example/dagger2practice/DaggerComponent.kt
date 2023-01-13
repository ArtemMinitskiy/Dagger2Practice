package com.example.dagger2practice

import dagger.Component

@Component(modules = [CarModule::class])
interface DaggerComponent {
    fun inject(activity: MainActivity)
}