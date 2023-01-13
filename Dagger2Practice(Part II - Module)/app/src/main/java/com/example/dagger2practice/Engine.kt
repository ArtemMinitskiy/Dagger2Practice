package com.example.dagger2practice

import dagger.Lazy
import javax.inject.Inject

class Engine @Inject constructor(private var fuel: Lazy<Fuel>) {
    @Inject
    lateinit var cylinder: Cylinder

    fun start() {
        if (fuel != null) {
            print("Started with ! ${fuel.get().fuelType}")
        } else {
            print("No more fuel!")
        }
    }
}