package com.example.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    //https://bloggie.io/@_junrong/dagger-2-for-android-part-iii-the-qualifier-and-named-annotation

    @Inject
    @field:Named("Mercedes")
    lateinit var carMercedes: Car

    @Inject
    @field:Named("Tesla")
    lateinit var carTesla: Car

//    @Inject
//    @field:NamedClone2(CarColor.Green)
//    lateinit var carMercedes: Car
//
//    @Inject
//    @field:NamedClone2(CarColor.Red)
//    lateinit var carTesla: Car

    //Custom Annotation name
//    @Inject
//    @field:NamedClone("Mercedes")
//    lateinit var carMercedes: Car
//
//    @Inject
//    @field:NamedClone("Tesla")
//    lateinit var carTesla: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerDaggerComponent.builder().build().inject(this)
        Log.i("mLog", carMercedes.name)
        Log.i("mLog", carTesla.name)

    }
}