package com.example.dagger2practice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object DaggerModuleObject {
    @Provides
    @JvmStatic
    fun getBoschCylinder(): Cylinder = BoschCylinder()

    @JvmStatic
    @Provides
    fun getColor(): Color = Color("")

    @Provides
    @Named("blueColor")
    @JvmStatic
    fun getColorBlue(): Color{
        return Color("blue")
    }

    @JvmStatic
    @Named("redColor")
    @Provides
    fun getColorRed(): Color = Color("red")

}