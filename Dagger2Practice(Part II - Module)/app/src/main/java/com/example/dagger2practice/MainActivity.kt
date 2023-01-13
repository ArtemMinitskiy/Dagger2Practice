package com.example.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerDaggerComponent.create().inject(this)
        Log.i("mLog", car.startCar().toString())
        Log.i("mLog", car.color.toString())
        Log.i("mLog", car.key.toString())
        Log.i("mLog", car.driver.toString())

    }
}