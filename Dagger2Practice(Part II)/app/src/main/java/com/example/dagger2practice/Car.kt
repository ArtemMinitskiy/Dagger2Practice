package com.example.dagger2practice

import javax.inject.Inject
import javax.inject.Provider

class Car @Inject constructor(private var engine: Provider<Engine>) {
    var key: Key? = null
        @Inject set

    fun startCar() {
        engine.get().start()
    }
}
