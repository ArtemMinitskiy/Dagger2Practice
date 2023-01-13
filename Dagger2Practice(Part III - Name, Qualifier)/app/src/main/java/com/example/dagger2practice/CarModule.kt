package com.example.dagger2practice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CarModule {

    @Provides
    @Named("Mercedes")
    fun provideMercedes(): Car = Car("Mercedes")

    @Provides
    @Named("Tesla")
    fun provideTesla(): Car = Car("Tesla")

//    @Provides
//    @NamedClone2(CarColor.Green)
//    fun provideMercedes(): Car = Car("Mercedes")
//
//    @Provides
//    @NamedClone2(CarColor.Red)
//    fun provideTesla(): Car = Car("Tesla")

//    @Provides
//    @NamedClone("Mercedes")
//    fun provideMercedes(): Car = Car("Mercedes")
//
//    @Provides
//    @NamedClone("Tesla")
//    fun provideTesla(): Car = Car("Tesla")

}