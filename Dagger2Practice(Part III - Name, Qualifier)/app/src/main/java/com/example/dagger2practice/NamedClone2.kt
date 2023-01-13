package com.example.dagger2practice

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class NamedClone2(val value: CarColor)

enum class CarColor {
    Red, Green
}