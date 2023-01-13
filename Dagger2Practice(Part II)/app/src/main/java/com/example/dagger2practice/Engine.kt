package com.example.dagger2practice

import android.util.Log
import javax.inject.Inject
import dagger.Lazy

class Engine @Inject constructor(private var fuel: Lazy<Fuel>) {
    fun start() {
        if (fuel != null) {
            Log.i("mLog", "Started with ${fuel.get().fuelType}")
        } else {
            Log.i("mLog", "No more fuel!")
        }
    }
}