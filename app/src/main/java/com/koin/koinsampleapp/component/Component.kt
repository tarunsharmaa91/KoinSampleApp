package com.koin.koinsampleapp.component

import com.koin.koinsampleapp.demo.Car
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component: KoinComponent {
    //Below line is to lazily create object
    val car: Car by inject()

    //Below line is to eagerLy create object
    val car1: Car = get()
}