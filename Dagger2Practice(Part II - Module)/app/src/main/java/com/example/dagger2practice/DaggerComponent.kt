package com.example.dagger2practice

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DaggerModuleObject::class, DaggerModule::class])
interface DaggerComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel
    fun getKey(): Key

    fun inject(act: MainActivity)
}