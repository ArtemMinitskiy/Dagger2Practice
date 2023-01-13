package com.example.dagger2practice

import dagger.Binds
import dagger.Module

@Module
interface DaggerModule {
    @Binds
    fun bindDriver(driver: Ivanov): Driver
}
