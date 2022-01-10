package com.koin.koinsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.koin.koinsampleapp.component.Component
import com.koin.koinsampleapp.demo.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    //Below is the direct way of injecting
    //private val car: Car by inject()

    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //car.startCar()

        component.car.startCar()
    }
}