package com.example.dagger2practice

import javax.inject.Inject

class Fuel @Inject constructor() {
    private val fuelType = if (BuildConfig.DEBUG) {
        "benzine"
    } else {
        "diesel"
    }
}
